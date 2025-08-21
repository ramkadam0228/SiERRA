package simpleJava;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.java.sl.In;

public class empPojo {
    @JsonProperty
    private Integer empID;

    public empPojo(Integer empID, String empName, String empSurname) {
        this.empID = empID;
        this.empName = empName;
        this.empSurname = empSurname;
    }

    public empPojo() {
    }

    @Override
    public String toString() {
        return "empPojo{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getempID() {
        return empID;
    }

    public void setempID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    @JsonProperty
    private String empName;
    @JsonProperty
    private String empSurname;
}
