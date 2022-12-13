package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
