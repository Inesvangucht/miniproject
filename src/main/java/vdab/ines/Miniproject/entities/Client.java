package vdab.ines.Miniproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Client {
    // we gebruiken Long met hoofdletter om een null waarde in te kunnen geven
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.TABLE) //ID bij TABLE wordt vrijgegeven als client wordt verwijderd
    private Long id;
    private String firstName;
    private String LastMame;
    private LocalDate birthday;

    //command + n om snel constructors, getters en setters aan te maken

    //lege constructor nodig
    public Client() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastMame() {
        return LastMame;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastMame(String lastMame) {
        LastMame = lastMame;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

