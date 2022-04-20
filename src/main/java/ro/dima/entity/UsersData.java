package ro.dima.entity;

import lombok.extern.log4j.Log4j;
import org.hibernate.validator.constraints.UniqueElements;
import ro.dima.validator.UniqueEmail;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

// I created 2 methods for not allowing duplicate for email.The second one with @UniqueEmail is stoped.
@Entity
@Table(name = "users_data", uniqueConstraints = {
        @UniqueConstraint(name = "unique_email", columnNames = {"email"})
})

public class UsersData {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "email")
   // @UniqueEmail
    private String email;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "locality_id", nullable = false)
    private Locality locality;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "county_id", nullable = false)
    private County county;

    @Column
    private int age ;

    @Column
    private String ocupation;

    public UsersData() {
    }

    public UsersData(Long id, String name, String email, Locality locality, County county, int age, String ocupation) {
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
