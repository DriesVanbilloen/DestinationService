package domain;

public class Destination {
	
	public String city,information;
	
	public Destination(String city, String information) {
		setCity(city);
		setInformation(information);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if(city == null || city.isEmpty()) throw new IllegalArgumentException();
		this.city = city;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		if(information == null || information.isEmpty()) throw new IllegalArgumentException();
		this.information = information;
	}
}
