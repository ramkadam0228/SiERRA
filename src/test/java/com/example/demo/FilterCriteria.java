package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FilterCriteria {

    public List<filterTapiOutPojo> col = new ArrayList<>();

    public void addColumn(filterTapiOutPojo filterTapiOutPojo) {
        col.add(filterTapiOutPojo);
        col.forEach(System.out::println);
    }


}
