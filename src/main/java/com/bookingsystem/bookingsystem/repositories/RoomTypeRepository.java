package com.bookingsystem.bookingsystem.repositories;

import com.bookingsystem.bookingsystem.models.RoomType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends CrudRepository<RoomType, Long> {
}
