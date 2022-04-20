package ro.dima.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class CountyDto {
    private Long id;
    private String countyAName;

    private String countyCode;

    public CountyDto(Long id, String countyAName, String countyCode) {
        this.id = id;
        this.countyAName = countyAName;
        this.countyCode = countyCode;
    }
    public CountyDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountyAName() {
        return countyAName;
    }

    public void setCountyAName(String countyAName) {
        this.countyAName = countyAName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
}
