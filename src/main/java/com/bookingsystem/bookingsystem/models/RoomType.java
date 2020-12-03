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
    public Long id;
    public String description;
    public Integer peopleNo;
    public Integer price;

}
