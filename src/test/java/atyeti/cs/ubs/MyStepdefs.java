package atyeti.cs.ubs;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class MyStepdefs {

    @Value("${TAPIOUTFile}")
    public String TAPIOUTFile;

    @Given("<TAPIOUTFile> is processed in SiERRA")
    public void tapioutfileIsProcessedInSiERRA(String TAPIOUTFile) {
        System.out.println("I am in Given");
        System.out.println(TAPIOUTFile);
    }

    @Before
    public void printValues() {
        System.out.println("Before Hook: TAPIOUTFile = " + TAPIOUTFile);
    }



}
