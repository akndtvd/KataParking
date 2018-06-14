package kataparking.dao;

import java.util.ArrayList;

import kataparking.model.Parking;

public interface ParkingDao {
	
	ArrayList<Parking> findAllParkings();
	
	ArrayList<Parking> findAllParkingsByArrdt(String arrdt);
	
	Parking findParkingById(String id);

}
