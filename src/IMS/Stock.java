package IMS;

public class Stock {
	 private int locationID; // PK, FK
	 private String itemID; // PK, FK
	 private int quantity;
	 
	 public Stock(int locationID, String itemID, int quantity) {
	     this.locationID = locationID;
	     this.itemID = itemID;
	     this.quantity = quantity;
	 }
	 
	 public int getLocationID() { 
		 return locationID; 
	 }
	 
	 public void setLocationID(int locationID) {
		 this.locationID = locationID;
	 }
	 
	 public String getItemID() { 
		 return itemID; 
	 }
	 
	 public void setItemID(String itemID) {
		 this.itemID = itemID; 
	 }
	 
	 public int getQuantity() {
		 return quantity;
	 }
	 
	 public void setQuantity(int quantity) { 
		 this.quantity = quantity; 
	 }
}
