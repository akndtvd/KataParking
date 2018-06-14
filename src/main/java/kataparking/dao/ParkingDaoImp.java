package kataparking.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import kataparking.model.Parking;

@Repository
public class ParkingDaoImp implements ParkingDao {

	@Override
	public ArrayList<Parking> findAllParkings() {
		ArrayList<Parking> parkingsEnDur = parkingsBddEnDur();
		return parkingsEnDur;
	}

	@Override
	public ArrayList<Parking> findAllParkingsByArrdt(String arrdt) {
		ArrayList<Parking> parkingEnDur = parkingsBddEnDur();
		ArrayList<Parking> parkingsChercher = new ArrayList<Parking>();
		for (Parking p : parkingEnDur) {
			if ( p != null && p.getArrdt().trim().equals(arrdt.trim())){
				parkingsChercher.add(p);
			}
		}
		return parkingsChercher;
	}

	@Override
	public Parking findParkingById(String id) {
		ArrayList<Parking> parkingEnDur = parkingsBddEnDur();
		Parking parkingChercher = new Parking();
		for (Parking p : parkingEnDur) {
			if ( p != null && p.getID().trim().equals(id.trim())){
				parkingChercher = p;
				break;
			}
		}
		return parkingChercher;
	}	
	
	public ArrayList<Parking> parkingsBddEnDur() {

		String fichierParkings = "/parkings.csv";	
		ArrayList<Parking> listeParkings = new ArrayList<Parking>();

		try {
			Stream<String> stream = Files.lines(Paths.get(fichierParkings));
			listeParkings = (ArrayList<Parking>) stream.filter(line -> !line.startsWith("OBJECTID")).map(mapToParking)
					.collect(Collectors.toList());
		} catch (IOException ex) {
			ex.getMessage();
		}
		return listeParkings;

	}

	public Function<String, Parking> mapToParking = (ligne) -> {

		String[] parkingString = ligne.split(";");
		Parking item = new Parking();

		item.setID(parkingString[1]);
		item.setNOM_PARC(parkingString[2]);
		item.setADRESS_SSC(parkingString[3]);
		item.setACCES_VL(parkingString[5]);
		item.setArrdt(parkingString[6]);
		item.setDELEG(parkingString[7]);
		item.setSITE_DELEG(parkingString[8]);
		item.setTEL(parkingString[9]);
		item.setH_PARC_CM(parkingString[10]);
		item.setTYPE_PARC(parkingString[12]);
		item.setHORAIRE_NA(parkingString[13]);
		item.setASC_SURF(parkingString[14]);
		item.setACCES_MOTO(parkingString[15]);
		item.setACCES_VELO(parkingString[16]);
		item.setV_ELEC_CH(parkingString[17]);
		item.setAUTOPART(parkingString[18]);
		item.setGeo_shape(parkingString[69]);
		item.setGeo_point_2d(parkingString[70]);

		return item;

	};

}
