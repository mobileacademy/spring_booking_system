package com.bookingsystem.bookingsystem.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(targetEntity = RoomType.class)
    private RoomType roomType;
    private String status;
}
