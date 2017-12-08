package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import db.DestinationDB;

@RestController
public class DestinationController {

	public DestinationDB database = new DestinationDB();
	
	@RequestMapping("/destination")
	public String getDestination(@RequestParam(value="city")String city) {
		return database.getDestionation(city).getInformation();
	}
	@RequestMapping("/info")
	public String getInfo() {
		return "Dit is de Destination service van het reisbureau: Dries Vanbilloen";
	}
}
