package com.bookingsystem.bookingsystem.repositories;

import com.bookingsystem.bookingsystem.models.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {
}
