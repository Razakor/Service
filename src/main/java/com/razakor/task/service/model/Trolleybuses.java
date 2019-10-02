package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "trolleybuses")
public class Trolleybuses {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "trolleybuses_stops",
            joinColumns = @JoinColumn(name = "trolleybus", referencedColumnName="number"),
            inverseJoinColumns = @JoinColumn(name = "stop", referencedColumnName="name"))
    private Set<Stops> stops;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trolleybus")
    private Set<Hours> hours;

    public Trolleybuses() {
    }
}