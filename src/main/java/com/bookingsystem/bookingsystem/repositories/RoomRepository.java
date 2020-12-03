package com.bookingsystem.bookingsystem.repositories;

import com.bookingsystem.bookingsystem.models.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
