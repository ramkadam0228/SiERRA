package com.example.demo;
import com.opencsv.CSVWriter;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

//@Component
public class TapiWorld implements En {
//    public class TapiWorld implements En {
    @Value("${TAPIOUTFile}")
    public String TAPIOUTFile;

//
    @Autowired
    public TapiOutPojo tapiOutPojo;

    @Autowired
    public FilterCriteria filterCriteria;

    @Autowired
    public CsvReaderExample csvReaderExample;
    ArrayList<TapiOutPojo> al = new ArrayList<>();
    ArrayList<TapiOutPojo> filteredal = new ArrayList<>();
    public TapiWorld() {
        Given("^<TAPIOUTFile> is processed in SiERRA$", () -> {
            System.out.println(TAPIOUTFile);
            al = csvReaderExample.readTapiOutFile(TAPIOUTFile);
        });

//        When("^Records are filtered with column \"([^\"]*)\"$", (String product) -> {
//            filteredal = (ArrayList<TapiOutPojo>) al.stream().filter(i-> i.getPRODUCT_ID_VALUE_1().equals(product)).collect(Collectors.toList());
////            filteredal.forEach(System.out::println);
//        });

        List<TapiOutPojo> finalList = new ArrayList<>();

        When("^Records are filtered with column$",
                (DataTable table) -> {
                    List<List<String>> listOfRows = table.asLists(String.class);
//                    (filtercolumns.asLists()).forEach(System.out::println);
//                   rows = table.asLists(String.class);
//                    rows.remove(0);
                    System.out.println(listOfRows.get(0).get(1));

//                   al.stream().filter(i-> i.getPRODUCT_ID_VALUE_1().equals(listOfRows.get(0).get("PRODUCT_ID_VALUE_1"))).forEach(System.out::println);

                   for (int n=0;n<al.size();n++){
                        for (int m=1;m<listOfRows.size();m++){
//                            for (int o=1;o<listOfRows.size();o++){
                                if((al.get(n).getPRODUCT_ID_VALUE_1().equals(listOfRows.get(m).get(1))) &&
                                        (al.get(n).getBU().toString().equals(listOfRows.get(m).get(0)))){
                                    finalList.add(al.get(n));
//                            }

                        }

                       }
                   }
                   finalList.stream().forEach(System.out::println);
                });

        String folderPath = "src/test/resources/Output/";
        String filename="SIERRA_IN_"+System.currentTimeMillis();
        String filePath = folderPath+filename;
        Then("^write the records in csv file$", () -> {
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                // Write the list of POJOs to the file as JSON
                objectMapper.writeValue(new File(filePath), finalList);
                System.out.println("List of POJOs successfully written to " + filePath);
            } catch (IOException e) {
                System.err.println("Error writing POJOs: " + e.getMessage());
                e.printStackTrace();
            }

        });


//        Given("^\"([^\"]*)\" is processed in SiERRA$", (String TAPIOUTFile) -> {
//            System.out.println(TAPIOUTFile);
//            al = csvReaderExample.readTapiOutFile(TAPIOUTFile);
//        });





    }



    @Before
    public void printValues() {
        System.out.println("Before Hook: TAPIOUTFile = " + TAPIOUTFile);
    }
}