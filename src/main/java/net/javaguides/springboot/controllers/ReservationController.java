package net.javaguides.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entities.Joueur;
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
	
	// Update Controller
	@PutMapping(value = "/updateReservation/{idR}")
	public Reservation updateReservation(@RequestBody Reservation reservation, @PathVariable("idR") Long id) {		
		return reservationServ.updateReservation(reservation, id);
	}
	
	// Delete Controller
	@DeleteMapping(value = "/deleteReservation/{idR}")
	public void deleteReservation(@PathVariable("idR") Long id) {
		reservationServ.deleteReservation(id);
	}

}
