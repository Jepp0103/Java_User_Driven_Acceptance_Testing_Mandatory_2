
public class Hardware {
	
	String name;
	
	String destination;
	
	public Hardware(String name) {
		this.name=name;
	}
	public Hardware(String name, String destination) {
		this.name=name;
		this.destination=destination;
	}
	
	
	public String getName() {
		return name;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination=destination;
	}
}
