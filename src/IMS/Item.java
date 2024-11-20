package IMS;

public class Item {
	private int itemID; // PK
    private String type;
    private double price;
    private String console;
    private String medium;
    private String album;
    private String ageRating;
    private String gameLength;
    
    public Item(int itemID, String type, double price, String console, String medium, String album, String ageRating, String gameLength) {
        this.itemID = itemID;
        this.type = type;
        this.price = price;
        this.console = console;
        this.medium = medium;
        this.album = album;
        this.ageRating = ageRating;
        this.gameLength = gameLength;
    }
    
    public int getItemID() { 
    	return itemID; 
    }
    
    public void setItemID(int itemID) { 
    	this.itemID = itemID;
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
    	return console; 
    }
    
    public void setConsole(String console) { 
    	this.console = console;
    }
    
    public String getMedium() { 
    	return medium;
    }
    
    public void setMedium(String medium) { 
    	this.medium = medium;
    }
    
    public String getAlbum() { 
    	return album;
    }
    
    public void setAlbum(String album) { 
    	this.album = album;
    }
    
    public String getAgeRating() { 
    	return ageRating;
    }
    
    public void setAgeRating(String ageRating) {
    	this.ageRating = ageRating; 
    }
    
    public String getGameLength() { 
    	return gameLength; 
    }
    
    public void setGameLength(String gameLength) { 
    	this.gameLength = gameLength; 
    }
}
