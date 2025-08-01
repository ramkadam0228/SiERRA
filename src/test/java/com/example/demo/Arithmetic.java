package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Arithmetic {
    Integer FirstNumber ;
    Integer SecondNumber ;
    Integer Result ;
    String Operation;


    public Integer getFirstNumber() {
        return FirstNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
        FirstNumber = firstNumber;
    }

    public Integer getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        SecondNumber = secondNumber;
    }

    public Integer getResult() {
        return Result;
    }

    public void setResult(Integer result) {
        Result = result;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }


}
