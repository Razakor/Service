package com.razakor.task.service.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "stops")
public class Stops {
    @Id
    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Trolleybuses.class, fetch = FetchType.EAGER, mappedBy = "stops")
    private Set<Trolleybuses> trolleybuses;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "stop")
    private Set<Hours> hours;

    public Stops() {
    }

    public Stops(String name, Set<Trolleybuses> trolleybuses, Set<Hours> hours) {
        this.name = name;
        this.trolleybuses = trolleybuses;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Trolleybuses> getTrolleybuses() {
        return trolleybuses;
    }

    public void setTrolleybuses(Set<Trolleybuses> trolleybuses) {
        this.trolleybuses = trolleybuses;
    }

    public Set<Hours> getHours() {
        return hours;
    }

    public void setHours(Set<Hours> hours) {
        this.hours = hours;
    }
}