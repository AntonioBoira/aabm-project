package IMS;

public class Item {
	private String itemID; // PK
    private String type;
    private double price;
    private String console;
    private String medium;
    private String album;
    private String age;
    private int gamelength;
    private String description;
    private String imageurl;
    
    public Item(String itemID, String type, double price, String console, String medium, String album, String age, int gamelength, String description, String imageurl) {
        this.itemID = itemID;
        this.type = type;
        this.price = price;
        this.console = console;
        this.medium = medium;
        this.album = album;
        this.age = age;
        this.gamelength = gamelength;
        this.description = description;
        this.imageurl = imageurl;
    }
    
    public String getItemID() { 
    	return itemID; 
    }
    
    public void setItemID(String itemID) { 
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
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String getConsole() {
    	return this.console;
    }
    
    public void setConsole(String console) {
    	this.console = console;
    }

    public String getMedium() {
    	return this.medium;
    }
    
    public void setMedium(String medium) {
    	this.medium = medium;
    }

    public String getAlbum() {
    	return this.album;
    }
    
    public void setAlbum(String album) {
    	this.album = album;
    }
    
    public String getAge() {
    	return this.age;
    }
    
    public void setAge(String age) {
    	this.age = age;
    }
    
    public int getGamelength() {
    	return this.gamelength;
    }
    
    public void setGamelength(int gamelength) {
    	this.gamelength = gamelength;
    }
    
    public String getDescription() {
    	return this.description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    
    }
    
}
