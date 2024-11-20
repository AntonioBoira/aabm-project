package IMS;

public class Location {
	private int locationID; // PK
    private String address;
    
    public Location(int locationID, String address) {
        this.locationID = locationID;
        this.address = address;
    }
    
    public int getLocationID() {
    	return locationID;
    }
    
    public void setLocationID(int locationID) {
    	this.locationID = locationID;
    }
    
    public String getAddress() {
    	return address; 
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
}