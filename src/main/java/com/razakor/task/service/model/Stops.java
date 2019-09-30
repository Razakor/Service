package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Stops {
    @Id
    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = Trolleybuses.class)
    private Set trolleybusSet;
}