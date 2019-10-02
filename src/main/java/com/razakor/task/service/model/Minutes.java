package com.razakor.task.service.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "minutes")
public class Minutes {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "hour_id")
    private Integer hourId;
    @Column(name = "val")
    private String value;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "hour_id", nullable = false, insertable = false, updatable = false)
    private Hours hour;
}