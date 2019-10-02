package com.razakor.task.service.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "trolleybuses")
public class Trolleybuses {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Stops.class, fetch = FetchType.EAGER)
    @JoinTable(name = "trolleybuses_stops",
            joinColumns = @JoinColumn(name = "trolleybus"),
            inverseJoinColumns = @JoinColumn(name = "stop"))
    private Set<Stops> stops;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trolleybus")
    private Set<Hours> hours;

    public Trolleybuses() {
    }

    public Trolleybuses(String number, String name, Set<Stops> stops, Set<Hours> hours) {
        this.number = number;
        this.name = name;
        this.stops = stops;
        this.hours = hours;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Stops> getStops() {
        return stops;
    }

    public void setStops(Set<Stops> stops) {
        this.stops = stops;
    }

    public Set<Hours> getHours() {
        return hours;
    }

    public void setHours(Set<Hours> hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return name;
    }
}