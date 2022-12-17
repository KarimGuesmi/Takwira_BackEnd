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

	@Override
	public Reservation updateReservation(Reservation reservation, Long id) {
		Reservation res = reservationRep.findById(id).get();
		res.setEquipe1(reservation.getEquipe1());
		res.setEquipe2(reservation.getEquipe2());
		res.setTelephone(reservation.getTelephone());
		res.setDate(reservation.getDate());
		res.setHeure(reservation.getheure());
		res.setTerrain(reservation.getTerrain());
		
		return reservationRep.save(res);
	}

	@Override
	public void deleteReservation(Long idReservation) {
		reservationRep.deleteById(idReservation);
		
	}
	
}
