package com.bookingsystem.bookingsystem.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="booking")
public class Booking {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String date;
    private Integer nights;
    private String arrivalTime;

    @OneToOne(targetEntity = Guest.class)
    private Guest guest;

    @OneToOne(targetEntity = Room.class)
    private Room room;
}
