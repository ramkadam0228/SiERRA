package com.example.demo;


    import com.opencsv.bean.CsvToBean;
    import com.opencsv.bean.CsvToBeanBuilder;
    import org.springframework.stereotype.Component;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;

@Component
public class CsvReaderExample {

    ArrayList<TapiOutPojo> al = new ArrayList<>();

    public ArrayList<TapiOutPojo> readTapiOutFile(String TAPIOUTFile) {
//        String csvFilePath = TAPIOUTFile; // Assuming a CSV file named products.csv

        try (BufferedReader reader = new BufferedReader(new FileReader(TAPIOUTFile))) {
            CsvToBean<TapiOutPojo> csvToBean = new CsvToBeanBuilder<TapiOutPojo>(reader)
                    .withType(TapiOutPojo.class)
                    .withSeparator(',') // Specify the delimiter
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<TapiOutPojo> pojo = csvToBean.parse();

            for (TapiOutPojo rows : pojo) {
                System.out.println("BU: " + rows.getBU() + ", ITR: " + rows.getINTRENALE_TRADE_REFERENCE() + ", PARTY_1_CODE: " + rows.getPARTY_1_CODE() + ", PARTY_1_CODE_TYPE: " + rows.getPARTY_1_CODE_TYPE());
                al.add(rows);
            }
        al.forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return al;
    }
}