//package com.example.demo;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
//
//
//public class Calculator{
////    Arithmetic ar = new Arithmetic();
//    Logger logger = LoggerFactory.getLogger(Calculator.class);
//
//
//    @Autowired
//    Arithmetic ar;
//
//    @Given("when {int} and {int}")
//    public void whenFirstNumberAndSecondNumber(Integer a, Integer b) {
//        logger.atInfo();
//        logger.warn("This is Given");
//        ar.setFirstNumber(a);
//        ar.setSecondNumber(b);
//    }
//
//    @When("{word} is performed")
//    public void operationIsPerformed(String ops) {
////        ar.setOperation(ops);
//        logger.error("This is Error");
//        switch (ops) {
//            case "Add":
//                ar.setResult(ar.getFirstNumber() + ar.getSecondNumber());
//                break;
//            case "Sub":
//                ar.setResult(ar.getFirstNumber() - ar.getSecondNumber());
//                break;
//            case "Mul":
//                ar.setResult(ar.getFirstNumber() * ar.getSecondNumber());
//                break;
//            case "Div":
//                ar.setResult(ar.getFirstNumber() / ar.getSecondNumber());
//                break;
//
//        }
//    }
//    @Then("Result should be {int}")
//    public void resultShouldBeResult(Integer Result) {
//        Assert.assertEquals(ar.getResult(),Result);
//    }
//
//
//
//}
