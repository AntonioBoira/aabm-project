package IMS;

public class Worker {
    /*WORKERID VARCHAR(35) PRIMARY KEY, 
	NAM VARCHAR(35), 
	SURNAME VARCHAR(35), 
	WORKROLE VARCHAR(35),
	PHONENUM VARCHAR(35),
	WEMAIL VARCHAR(35)
	FOREIGN KEY (LOCATIONID) REFERENCES LOCAT LOCATIONID*/
	
	private String id; //PK
	private String name;
	private String surname;
	private String role;
	private String phone;
	private String email;
	private String location; //FK -> LOCATION
	
	public Worker(String id, String name, String surname, String role, String phone, String email, String location) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.phone = phone;
		this.email = email;
		this.location = location;
	}
	
	public String getid() {
		return this.id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getname() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getsurname() {
		return this.surname;
	}
	
	public void setsurname(String surname) {
		this.surname = surname;
	}
	
	public String getrole() {
		return this.role;
	}
	
	public void setrole(String role) {
		this.role = role;
	}
	
	public String getphone() {
		return this.phone;
	}
	
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getemail() {
		return this.email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getlocation() {
		return this.location;
	}
	
	public void setlocation(String location) {
		this.location = location;
	}
}