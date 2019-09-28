package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Trolleybus {
    @Id
    @Column(name = "number")
    private String number;
    @Column(name = "name")
    private String name;
}