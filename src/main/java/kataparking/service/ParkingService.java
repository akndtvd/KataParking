package kataparking.service;

import java.util.ArrayList;

import kataparking.model.Parking;

public interface ParkingService {
	
	ArrayList<Parking> findAllParkings();
	
	ArrayList<Parking> findAllParkingsByArrdt(String arrdt);

	Parking findParkingById(String id);

}
