package com.example.demo;


import io.cucumber.java8.En;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class CalculatorJava8 implements En {
    @Autowired
    Arithmetic ar;
        Logger logger = LoggerFactory.getLogger(CalculatorJava8.class);
    public CalculatorJava8() {

        Given("when {int} and {int}", (Integer FirstNumber, Integer SecondNumber) -> {
            ar.setFirstNumber(FirstNumber);
            ar.setSecondNumber(SecondNumber);

        });
        When("{word} is performed", (String ops) -> {
            logger.error("This is Error");
            switch (ops) {
                case "Add":
                    ar.setResult(ar.getFirstNumber() + ar.getSecondNumber());
                    break;
                case "Sub":
                    ar.setResult(ar.getFirstNumber() - ar.getSecondNumber());
                    break;
                case "Mul":
                    ar.setResult(ar.getFirstNumber() * ar.getSecondNumber());
                    break;
                case "Div":
                    ar.setResult(ar.getFirstNumber() / ar.getSecondNumber());
                    break;
            }
            });
            Then("Result should be {int}", (Integer Result) -> {

                Assert.assertEquals(ar.getResult(),Result);
            });

    }
    }
