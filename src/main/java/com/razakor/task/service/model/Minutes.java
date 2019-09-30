package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Minutes {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "hour_id")
    private Integer hourId;
    @Column(name = "val")
    private String value;
}