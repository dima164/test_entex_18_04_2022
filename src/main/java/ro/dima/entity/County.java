package ro.dima.entity;

import javax.persistence.*;

@Entity
@Table(name = "counties")
public class County {
    @Id
    @Column(name = "id_county")
    private Long id;

    @Column(name = "county_name")
    private String countyAName;   /* I have to put an "A" in the middle of countyName because I have to be
    sure that this column will be on the second position,after - column  id_county - because this is the
    position in the header of CSV file (if I use - countyName - will be on position nr.3 and will not
    corespund with the header of CSV ) */

    @Column(name = "county_code")
    private String countyCode;

    public County() {
    }

    public Long getId() {
        return id;
    }

    public String getCountyAName() {
        return countyAName;
    }

    public String getCountyCode() {
        return countyCode;
    }
}
