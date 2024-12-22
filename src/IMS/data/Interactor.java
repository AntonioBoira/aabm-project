package IMS.data;

import java.sql.*;
import java.util.Properties;

import IMS.*;
import business.Usuario.UsuarioDTO;

public class Interactor extends DAO{

	public Interactor(Properties prop, String jdbc, String dbuser, String dbpass) {
		super(prop, jdbc, dbuser, dbpass);
	}
	
	public void addItem(Item it){
		//ITEMID,TYPE,PRICE,CONSOLE,MEDIUM,ALBUM,AGERATING,GAMELENGTH,DESCR,IMAGEURL
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("add-item"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setString(1,it.getItemID());
        	ps.setString(2, it.getType());
        	ps.setDouble(3, it.getPrice());
        	ps.setString(4, it.getConsole());
        	ps.setString(5, it.getMedium());
        	ps.setString(6, it.getAlbum());
        	ps.setString(7, it.getAge());
        	ps.setInt(8, it.getGamelength());
        	ps.setString(9,	it.getDescription());
        	ps.setString(10, it.getImageurl());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
		
	}
	
	public void removeItem(String ItemID) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("remove-item"), PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, ItemID);
	        ps.executeUpdate();
		} catch (SQLException e) {
			close();
			System.out.println(e);
		}
	}
	
	public Item searchItem(String ItemID) {
		//ITEMID,TYPE,PRICE,CONSOLE,MEDIUM,ALBUM,AGERATING,GAMELENGTH,DESCR,IMAGEURL
	     Item item = null;
	     
	     try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("search-item"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ps.setString(1, ItemID);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 item = new Item(rs.getString("ITEMID"), rs.getString("TYPE"), rs.getDouble("PRICE"), rs.getString("CONSOLE"), rs.getString("MEDIUM"), rs.getString("ALBUM"), rs.getString("AGERATING"), rs.getInt("GAMELENGTH"), rs.getString("DESCR"), rs.getString("IMAGEURL"));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
	     
	     return item;
	}
	
	public int trackTransactions() {
	     
		return 0;
	}
	
	public void addLocation() {
	     
	}
	
	public void removeLocation() {
	     
	}
	
	public void addUser() {
	     
	}
	
	public void removeUser() {
	     
	}
	
	public void checkStockLocation() {
	     
	}
	
	public Object[] checkLocationsAvailable() {
	    
		
		return new Object[0];
	}
	
	public void createDiscount() {
	     
	}
}