package IMS;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int itemID; // PK
    private String type;
    private float price;
    private int stock;
    private String imageurl;
    private List<String> itemDetails;
    
    public Item(int itemID, String type, float price, int stock) {
        this.itemID = itemID;
        this.type = type;
        this.price = price;
        this.stock = stock;
        this.itemDetails = new ArrayList<>();
    }
    
    public int getItemID() { 
    	return itemID; 
    }
    
    public void setItemID(int itemID) { 
    	this.itemID = itemID;
    }

    public void setImageurl(String string) {
    	this.imageurl = string;
    }
    public String getImageurl(){
    	return this.imageurl;
    }
    public String getType() { 
    	return type;
    }
    
    public void setType(String type) { 
    	this.type = type; 
    }
    
    public double getPrice() { 
    	return price;
    }
    
    public void setPrice(float price) {
    	this.price = price;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public List<String> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<String> itemDetails) {
        this.itemDetails = itemDetails;
    }

    public void addItemDetail(String detail) {
        this.itemDetails.add(detail);
    }

    public void removeItemDetail(String detail) {
        this.itemDetails.remove(detail);
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }
}
