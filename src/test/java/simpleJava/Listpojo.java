package simpleJava;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Listpojo {
    private String name;
    private String surname;
    private Integer empid;



    @Override
    public String toString() {
        return "LIstpojo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", empid=" + empid +
                '}';
    }

    public Listpojo(String name, String surname, Integer empid) {
        this.name = name;
        this.surname = surname;
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}
