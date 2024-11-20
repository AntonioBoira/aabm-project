package IMS;

public class Order {
	private int orderID; // PK
	private String itemID; // FK
	private String accID; // FK
	private String type;
	
	public Order(int orderID, String itemID, String accID, String type) {
        this.orderID = orderID;
        this.itemID = itemID;
        this.accID = accID;
        this.type = type;
    }
	
	public int getOrderID() {
		return orderID;
	}
	
    public void setOrderID(int orderID) {
    	this.orderID = orderID;
    }
    
    public String getItemID() {
    	return itemID;
    }
    
    public void setItemID(String itemID) {
    	this.itemID = itemID;
    }
    
    public String getAccountID() {
    	return accID;
    }
    
    public void setAccountID(String accountID) {
    	this.accID = accountID;
    }
    
    public String getType() {
    	return type;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
}
