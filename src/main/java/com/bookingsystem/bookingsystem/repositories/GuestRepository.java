package com.bookingsystem.bookingsystem.repositories;

import com.bookingsystem.bookingsystem.models.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
