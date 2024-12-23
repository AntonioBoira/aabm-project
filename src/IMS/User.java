package IMS;

public class User {

	private String id; //PK
	private String name;
	private String surname;
	private String address;
	private String bank;
	private String phone;
	private String email;
	
	public User(String id, String name, String surname, String address, String bank, String phone, String email) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.bank = bank;
		this.phone = phone;
		this.email = email;
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
	
	public String getaddress() {
		return this.address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getbank() {
		return this.bank;
	}
	
	public void setbank(String bank) {
		this.bank = bank;
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
	
}
