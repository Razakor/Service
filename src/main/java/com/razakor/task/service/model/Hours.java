package com.razakor.task.service.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "hours")
public class Hours {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "trolleybus_number")
    private String trolleybusNumber;
    @Column(name = "stop_name")
    private String stopName;
    @Column(name = "val")
    private String value;
    @Column(name = "is_work_day")
    private Boolean isWorkDay;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hour")
    private Set<Minutes> users;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "trolleybus_number", nullable = false, insertable = false, updatable = false)
    private Trolleybuses trolleybus;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "stop_name", nullable = false, insertable = false, updatable = false)
    private Stops stop;
}