package IMS;

public class Worker {
	private int workerID; // PK
    private String name;
    private String surname;
    private String role;
    private String locationID; // FK
    
    public Worker(int workerID, String name, String surname, String role, String locationID) {
        this.workerID = workerID;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.locationID = locationID;
    }
    
    public int getWorkerID() {
    	return workerID; 
    }
    public void setWorkerID(int workerID) {
    	this.workerID = workerID; 
    }
    
    public String getName() {
    	return name; 
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getSurname() {
    	return surname;
    }
    
    public void setSurname(String surname) {
    	this.surname = surname;
    }
    
    public String getRole() {
    	return role;
    }
    
    public void setRole(String role) {
    	this.role = role;
    }
    
    public String getLocationID() {
    	return locationID;
    }
    
    public void setLocationID(String locationID) {
    	this.locationID = locationID;
    }
}
