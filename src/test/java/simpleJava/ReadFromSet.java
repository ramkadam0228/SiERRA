package simpleJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReadFromSet {
    public static void main(String[] args) {
        addValuestoList();
        addValuesToSet();
    }
    static List<String> list1 = new ArrayList<>();

    private static void addValuestoList() {
        list1.add("Ram");
        list1.add("Kadam");
        list1.add(("SUresh"));
    }

    static HashSet<String> set1=new HashSet();
    private static void addValuesToSet() {
        set1.add("Ram");
        set1.add("Kadam");
        set1.add("Ram");
        set1.add("Isha");
        set1.addAll(list1);
        set1.stream().forEach(System.out::println);
    }
}
