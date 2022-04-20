package ro.dima.dto;

import ro.dima.entity.County;
import ro.dima.entity.Locality;


public class UsersDataDtoWithId {

    private Long id;

    private String name;


    private String email;


    private Long idLocality;

    private Long idCounty;

    private int age;

    private String ocupation;

    public UsersDataDtoWithId() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdLocality() {
        return idLocality;
    }

    public void setIdLocality(Long idLocality) {
        this.idLocality = idLocality;
    }

    public Long getIdCounty() {
        return idCounty;
    }

    public void setIdCounty(Long idCounty) {
        this.idCounty = idCounty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
}
