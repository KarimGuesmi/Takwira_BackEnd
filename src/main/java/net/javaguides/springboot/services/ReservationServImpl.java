package net.javaguides.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.entities.Reservation;
import net.javaguides.springboot.repository.ReservationRepository;

@Service
public class ReservationServImpl implements IServiceReservation{

	@Autowired
	ReservationRepository reservationRep;
	
	@Override
	public Reservation addReservation(Reservation reservation) {
		return reservationRep.save(reservation)	;
	}

	@Override
	public List<Reservation> addListReservation(List<Reservation> listReservation) {
		return reservationRep.saveAll(listReservation);
	}
	
}
