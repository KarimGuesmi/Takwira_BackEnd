package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Reservation;
import net.javaguides.springboot.services.ReservationServImpl;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationServImpl reservationServ;
	
	@PostMapping(value = "/addReservation")
	public Reservation addReservation(@RequestBody Reservation reservation) {
		return reservationServ.addReservation(reservation);
	}
	
	@PostMapping(value = "/addListReservation")
	public List<Reservation> addReservation(@RequestBody List<Reservation> listReservation) {
		return reservationServ.addListReservation(listReservation);
	}

}
