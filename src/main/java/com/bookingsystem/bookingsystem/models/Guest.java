package com.bookingsystem.bookingsystem.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="guest")
public class Guest {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

//    public Guest() {
//    }
//
//    public Guest(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
}
