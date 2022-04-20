package ro.dima.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class LocalityDto {

    private Long id;

    private String aLocalityName;

    private String countyCode;

    public LocalityDto() {
    }

    public LocalityDto(Long id, String aLocalityName, String countyCode) {
        this.id = id;
        this.aLocalityName = aLocalityName;
        this.countyCode = countyCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getaLocalityName() {
        return aLocalityName;
    }

    public void setaLocalityName(String aLocalityName) {
        this.aLocalityName = aLocalityName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
}
