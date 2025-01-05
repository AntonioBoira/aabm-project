package IMS;

import java.util.ArrayList;
import java.time.*;

public class Order {

	private String id; //PK
	private String customer;
	private double price;
	private String type;
	private LocalDate date;
	private ArrayList<String> items;
	
	public Order(String id, String customer, double price, String type, LocalDate date, ArrayList<String> items) {
		this.id = id;
		this.customer = customer;
		this.price = price;
		this.type = type;
		this.items = items;
		this.date = date;
	}
	
	public String getid() {
		return this.id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getcustomer() {
		return this.customer;
	}
	
	public void setcustomer(String customer) {
		this.customer = customer;
	}
	
	public double getprice() {
		return this.price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	
	public LocalDate getdate() {
		return this.date;
	}
	
	public void setdate(LocalDate date) {
		this.date = date;
	}
	
	public ArrayList<String> getitems(){
		return this.items;
	}
	
	public void setitems(ArrayList<String> items) {
		this.items = items;
	}
}

