package ro.dima.dto;

import org.hibernate.validator.constraints.UniqueElements;
import ro.dima.entity.County;
import ro.dima.entity.Locality;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;


public class UsersDataDto {

    private Long id;

    private String name;


    private String email;


    private Locality locality;

    private County county;

    private int age;

    private String ocupation;

    public UsersDataDto() {
    }

    public UsersDataDto(Long id, String name, String email, Locality locality, County county, int age, String ocupation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.locality = locality;
        this.county = county;
        this.age = age;
        this.ocupation = ocupation;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Locality getLocality() {
        return locality;
    }

    public County getCounty() {
        return county;
    }

    public int getAge() {
        return age;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
}
