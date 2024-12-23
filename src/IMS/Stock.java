package IMS;

public class Stock {
	
	private String locationid; //FK -> LOCATION
	private String itemid; //FK -> ITEM
	private int quantity;
	
	public Stock(String location, String item, int q) {
		this.locationid = location;
		this.itemid = item;
		this.quantity = q;
	}
	
	public String getlocation(){
		return this.locationid;
	}
	
	public void setlocation(String id) {
		this.locationid = id;
	}
	
	public String getitem() {
		return this.itemid;
	}
	
	public void setitem(String id) {
		this.itemid = id;
	}
	
	public int getquantity() {
		return this.quantity;
	}
	
	public void setquantity(int q) {
		this.quantity = q;
	}
	
}
