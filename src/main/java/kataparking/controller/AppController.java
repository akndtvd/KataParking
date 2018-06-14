package kataparking.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import kataparking.model.Parking;
import kataparking.service.ParkingService;
import kataparking.service.ParkingServiceImp;

@Controller
public class AppController {
	
	@Autowired
	private ParkingService parkingService;

	@GetMapping("/")
	public String getParking(Model model) {
		Parking parking = new Parking();
		model.addAttribute("parking",parking);
		return "ListerParkings";
	}

	@PostMapping("/")
	public String postParking(@ModelAttribute("parking") Parking parking, BindingResult result, Model model) {
		return "ListerParkings";
	}
	
	@PostMapping("/Parking")
	public String parkingByArrdt(@ModelAttribute("parking") Parking parking, BindingResult result, Model model) {
		String arrdt = parking.getArrdt();
		ArrayList<Parking> parkingsArrdt = parkingService.findAllParkingsByArrdt(arrdt);
		model.addAttribute("parkingsArrdt", parkingsArrdt);
		return "ListerParkingsArrdt";
	}

	@GetMapping("/Afficher/{id}")
	public String parkingById( Parking parking, BindingResult result,@PathVariable String id, Model model) {
		Parking parkingChercher = parkingService.findParkingById(id);
		String arrdt = parkingChercher.getArrdt();
		System.out.println("arrdt*" + arrdt + "*" + id);
		ArrayList<Parking> parkingsArrdt = parkingService.findAllParkingsByArrdt(arrdt);

		String urlMap = "https://maps.googleapis.com/maps/api/streetview?size=600x300&location=" + parkingChercher.getGeo_point_2d() + "&heading=151.78&pitch=-0.76&key=AIzaSyD-U9ZAnhTo7bajWci09ezw1BgfUCWK9F8";
		model.addAttribute("parkingsArrdt", parkingsArrdt);
		model.addAttribute("parkingChercher", parkingChercher);		
		model.addAttribute("urlMap", urlMap);		
		return "AfficherParking";
	}	
}
