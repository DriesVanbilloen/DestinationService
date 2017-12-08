package db;

import java.util.ArrayList;
import java.util.List;

import domain.Destination;

public class DestinationDB {

	public List<Destination> destinations;
	
	
	public DestinationDB() {
		destinations = new ArrayList<>();
		
		Destination leuven = new Destination("Leuven", "Historische stad met een oude stadsmuur.De universiteit in Leuven, de KULeuven is een van de bekendste universiteiten van Europa");
		destinations.add(leuven);
		Destination herent = new Destination("Herent" , "Herent is een van de buurgemeenten van Leuven, veel rustiger en is een groeiende stad!");
		destinations.add(herent);
		Destination kapellen = new Destination("Kapellen" , "Rustiek dorpje in Vlaams-Brabant. Heeft veel landschappen en is vooral nog een boerendorpje van vroeger. De grootste markt hier is appelen en peren");
		destinations.add(kapellen);
	}
	
	public Destination getDestionation(String city) {
		for (Destination result : destinations) {
			if(result.getCity().equals(city)) {
				return result;
			}
		}
		return new Destination("error", "city not found");
	}
}
