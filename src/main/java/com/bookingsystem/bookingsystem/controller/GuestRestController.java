package com.bookingsystem.bookingsystem.controller;

import com.bookingsystem.bookingsystem.models.Guest;
import com.bookingsystem.bookingsystem.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*User client app should let the user to:
register as a new user
view all hotel room types and prices per type
add a new booking request eg:
the user wants to make a reservation for 6 nights for 3 people for a roomType: single-> you need to check if there any free rooms->
you need to check if number of people is valid for the specified roomType- view all users bookings
Hotel Admin client app should let the admin to:add new roomview details about a guestview all booking requests
*/

@RestController
@RequestMapping("/api/guest")
public class GuestRestController {

    @Autowired
    private GuestRepository guestRepository;

    /*{
   "firstName":"value",
   "lastName":"value"}*/
    @PostMapping("/add")
    public void addNewGuest (Guest guest) {
        System.out.println(guest);
        guestRepository.save(guest);

    }

    @GetMapping
    public List<Guest> getGuestList () {
        return (List<Guest>) guestRepository.findAll();

    }

}
