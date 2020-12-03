package com.bookingsystem.bookingsystem.models;

public class RoomPriceDisplay {

    private String name;

    public RoomPriceDisplay(String description, int price) {
        this.name = description+" - "+price;
    }

    public String getName() {
        return name;
    }
}
