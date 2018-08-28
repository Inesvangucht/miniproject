package vdab.ines.Miniproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wine {

    @Id
    @GeneratedValue
    private Long id;
    private int year;
    private String grape;

    public Wine() {
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getGrape() {
        return grape;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGrape(String grape) {
        this.grape = grape;
    }
}
