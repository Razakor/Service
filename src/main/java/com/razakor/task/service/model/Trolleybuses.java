package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Trolleybuses {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Stops.class)
    private Set stopSet;
}