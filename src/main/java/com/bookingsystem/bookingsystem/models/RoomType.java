package com.bookingsystem.bookingsystem.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "room_type")
public class RoomType {

    @Id
    private Long id;
    private String description;
    private Integer peopleNo;
    private Integer price;

}
