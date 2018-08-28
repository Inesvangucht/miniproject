package vdab.ines.Miniproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Store {

    @Id
    @GeneratedValue
    private Long id;
    private String town;
    private String shopManager;
    private int numEmployees;

    public Store() {
    }

    public Long getId() {
        return id;
    }

    public String getTown() {
        return town;
    }

    public String getShopManager() {
        return shopManager;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setShopManager(String shopManager) {
        this.shopManager = shopManager;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }
}


