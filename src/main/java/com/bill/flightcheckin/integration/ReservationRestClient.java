package com.bill.flightcheckin.integration;

import com.bill.flightcheckin.integration.dto.Reservation;
import com.bill.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
