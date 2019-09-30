package com.razakor.task.service.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Hours {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "trolleybus_number")
    private String trolleybusNumber;
    @Column(name = "stop_name")
    private String stopName;
    @Column(name = "val")
    private String value;
    @Column(name = "is_work_day")
    private boolean isWorkDay;
}