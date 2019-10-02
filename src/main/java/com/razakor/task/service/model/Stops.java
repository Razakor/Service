package com.razakor.task.service.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "stops")
public class Stops {
    @Id
    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "stops")
    private Set<Trolleybuses> trolleybuses;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "stop")
    private Set<Hours> hours;
}