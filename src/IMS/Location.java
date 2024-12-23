package IMS;

public class Location {
	private String locationID;
	private String locaddress;
	
	public Location(String id, String address) {
		this.locationID = id;
		this.locaddress = address;
	}
	
	public String getlocationID() {
		return this.locationID;
	}
	
	public void setlocationID(String id) {
		this.locationID = id;
	}
	
	public String getlocaddress() {
		return this.locaddress;
	}
	
	public void setlocaddress(String address) {
		this.locaddress = address;
	}
}
