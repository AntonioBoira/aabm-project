package IMS;

public class Customer {
	private int accID; // PK
	private String name;
	private String surname;
	private String address;
	private String bankAcc;
	
	public Customer(int accID, String name, String surname, String address, String bankAcc) {
		this.accID = accID;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.bankAcc = bankAcc;
	}
	
	public int getAccID() {
		return accID;
	}
	
	public void setAccID(int accID) {
		this.accID = accID;
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
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) { 
    	this.address = address; 
    }
    
    public String getBankAccount() { 
    	return bankAcc; 
    }
    
    public void setBankAccount(String bankAcc) {
    	this.bankAcc = bankAcc;
    } 
}
