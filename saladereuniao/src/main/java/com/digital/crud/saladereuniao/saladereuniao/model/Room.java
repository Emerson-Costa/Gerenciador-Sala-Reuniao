package com.digital.crud.saladereuniao.saladereuniao.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Entity
@Table(name="meetingroom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    private long id;
    private String name;
    private String date;
    private String statHour;
    private String endHour;

}
