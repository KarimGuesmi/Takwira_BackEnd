package net.javaguides.springboot.services;

import java.util.List;

import net.javaguides.springboot.entities.Reservation;

public interface IServiceReservation {
	public Reservation addReservation(Reservation reservation);
	public List<Reservation> addListReservation(List<Reservation> listReservation);
}
