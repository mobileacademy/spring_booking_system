package com.bookingsystem.bookingsystem.controller;

import com.bookingsystem.bookingsystem.models.RoomType;
import com.bookingsystem.bookingsystem.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// cerinte de facut pentru acasa
//Hotel Admin client app should let the admin to:
//        add new room
//        view details about a guest
//        view all booking requests


@RestController
@RequestMapping("/api/admin")

public class AdminRestController {
    @Autowired
    private RoomTypeRepository roomTypeRepository;

    /*{
"id":100,
"description":"single room",
"peopleNo":1,
"price":99,
}*/

    @PostMapping("/add_roomtype")

    public void addNewRoomType (@RequestBody RoomType roomType) {
        System.out.println(roomType);
        roomTypeRepository.save(roomType);

    }

}
