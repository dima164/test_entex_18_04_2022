package ro.dima.entity;

import javax.persistence.*;

@Entity
@Table(name = "localities")
public class Locality {
    @Id
    @Column
    private Long id;

    @Column(name = "locality_name")
    private String aLocalityName;    /* I have to put an "a" in front of LocalityName because I have to be
    sure that this column will be on the second position,after - column id - because this is the position in the
   header of CSV file (if I use - localityName - will be on position nr.3 and will not corespund
    with the header of CSV ) */

    @Column(name = "county_code")
    private String countyCode;

    public Locality() {
    }

    public Long getId() {
        return id;
    }

    public String getALocalityName() {
        return aLocalityName;
    }

    public String getCountryCode() {
        return countyCode;
    }
}
