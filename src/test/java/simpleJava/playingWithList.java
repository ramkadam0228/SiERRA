package simpleJava;




import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import simpleJava.Listpojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class playingWithList {
    @Autowired
    public Listpojo lp;


    public static void main(String[] args) throws IOException {
        playingWithList p = new playingWithList();
        p.createNestedList();
//        p.filterlist();
        p.getPerticulatelement();
        p.readJson();
    }

    private void readJson() throws IOException {
        ObjectMapper om = new ObjectMapper();
        File file = new File("src/test/java/simpleJava/emp.json");
//        String fileString = file.toString();
        List<empPojo> emp = new ArrayList<>();
     emp = om.readValue(file, new TypeReference<List<empPojo>>() {});

     for (empPojo e: emp){
         System.out.println(e.getempID());
     }
    }

    private void getPerticulatelement() {
        List<Listpojo> lp = new ArrayList<>();
//        lp = outterList.stream().flatMap(Collection::stream).toList();
    }

    private void filterlist() {
        List<String> flist = new ArrayList<>();
//        flist =outterList.stream().flatMap(innerlist -> innerlist.stream()).collect(Collectors.toList());
//        flist =outterList.stream().flatMap(Collection::stream).toList();
        flist =outterList.stream().flatMap(Collection::stream).filter(i->i.contains("adam"))
                .toList();
        flist.forEach(System.out::println);
        System.out.println("----------------------");
    }

    List<List<String>> outterList = new ArrayList<>();
    public void createNestedList(){
        List<Listpojo> innerlist1 = new ArrayList<Listpojo>();

        Listpojo pojo = new Listpojo("Ram","Kadam",331);



        System.out.println(pojo.getName());
        System.out.println(pojo.getSurname());
        System.out.println(pojo.getEmpid());


        List<String> innerlist2 = new ArrayList<>();
        innerlist2= Arrays.asList("Shay","Udy","223");

        List<String> innerlist3 = new ArrayList<>();
        innerlist3= Arrays.asList("Isha","Kadam","111");


//        outterList=Arrays.asList(innerlist1,innerlist2,innerlist3);
        System.out.println(outterList);
         System.out.println("===========================");



    }

}
