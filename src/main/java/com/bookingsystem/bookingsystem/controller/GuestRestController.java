package com.bookingsystem.bookingsystem.controller;

import com.bookingsystem.bookingsystem.models.Guest;
import com.bookingsystem.bookingsystem.models.RoomPriceDisplay;
import com.bookingsystem.bookingsystem.models.RoomType;
import com.bookingsystem.bookingsystem.repositories.GuestRepository;
import com.bookingsystem.bookingsystem.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/*User client app should let the user to:
register as a new user
view all hotel room types and prices per type
ex:

--format
twin    - 10 ron
double  - 20 ron

add a new booking request eg:
the user wants to make a reservation for 6 nights for 3 people for a roomType: single-> you need to check if there any free rooms->
you need to check if number of people is valid for the specified roomType- view all users bookings
Hotel Admin client app should let the admin to:add new roomview details about a guestview all booking requests

comenzi baze de date

CREATE DATABASE bookingDatabase CHARACTER SET utf8 COLLATE utf8_unicode_ci;

GRANT ALL PRIVILEGES ON *.* TO 'newuser'@'localhost';
GRANT SELECT, INSERT, UPDATE, DELETE ON databaseName.* TO 'newuser'@'localhost';
GRANT EXECUTE ON databaseName.* TO 'newuser'@'localhost';

pentru setarea conexiunii, mergi in resource
*/





@RestController
@RequestMapping("/api/guest")
public class GuestRestController {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    /*{
   "firstName":"value",
   "lastName":"value"}*/
    @PostMapping("/add")
    public void addNewGuest (@RequestBody Guest guest) {
        System.out.println(guest);
        guestRepository.save(guest);

    }

    @GetMapping
    public List<Guest> getGuestList () {
        return (List<Guest>) guestRepository.findAll();
    }

    @GetMapping("/check_room_prices")
    public List<RoomPriceDisplay> getRoomTypeList () {
        List <RoomPriceDisplay> result = new ArrayList<>();
        List <RoomType> roomTypeList = (List<RoomType>) roomTypeRepository.findAll();
        for (RoomType roomType : roomTypeList) {
            result.add(new RoomPriceDisplay(roomType.description,roomType.price));
        }
        return result;

    }

}
