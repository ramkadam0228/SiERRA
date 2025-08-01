//package com.example.demo;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//
//
////@CucumberContextConfiguration
////@SpringBootTest(classes = TestConfig.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//
////@Component
//public class calSD {
//    int res;
//    @Given("when <Number{int}> and <Number{int}>")
//    public void whenNumberAndNumber(int arg0, int arg1) {
//         res = arg0+arg1;
////         return res;
//    }
//
//    @When("Addition is performed")
//    public void additionIsPerformed() {
//        System.out.println("Addition");
//    }
//
//    @Then("Result should be <Sum{int}>")
//    public void resultShouldBeSum(int arg0) {
//
//        Assert.assertEquals(res,arg0);
//    }
//}
