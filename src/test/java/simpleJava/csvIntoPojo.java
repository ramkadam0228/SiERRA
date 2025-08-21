package simpleJava;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.nio.file.Path;

public class csvIntoPojo {
    public static void main(String[] args) throws JSONException {
        getJsonIntoPoJO();
    }

    private static void getJsonIntoPoJO() throws JSONException {

        File file = new File("src/test/java/simpleJava/emp.json");

        JSONObject jsonobject = new JSONObject(String.valueOf(file));
        String jsonSTring = jsonobject.toString();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Listpojo person = objectMapper.readValue(jsonSTring, Listpojo.class);

            System.out.println("Name: " + person.getName());
            System.out.println("SurName: " + person.getSurname());
            System.out.println("EmpID: " + person.getEmpid());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


