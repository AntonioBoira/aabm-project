package IMS.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import IMS.*;
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
	
	public ArrayList<Item> listItems(){
		ArrayList<Item> items = new ArrayList<Item>();
		
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("list-item"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 items.add(new Item(rs.getString("ITEMID"), rs.getString("TYPE"), rs.getDouble("PRICE"), rs.getString("CONSOLE"), rs.getString("MEDIUM"), rs.getString("ALBUM"), rs.getString("AGERATING"), rs.getInt("GAMELENGTH"), rs.getString("DESCR"), rs.getString("IMAGEURL")));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
		
		return items;
	}
	
	public void createDiscount(String item, double price) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("modifyprice-item"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setDouble(1, price);
        	ps.setString(2, item);
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public void addLocation(Location loc) {
		//LOCATIONID,LOCADDRESS
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("add-location"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setString(1,loc.getlocationID());
        	ps.setString(2, loc.getlocaddress());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public void removeLocation(String id) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("remove-location"), PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, id);
	        ps.executeUpdate();
		} catch (SQLException e) {
			close();
			System.out.println(e);
		}
	}
	
	public ArrayList<Location> listLocation() {
		ArrayList<Location> locations = new ArrayList<Location>();
		
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("list-item"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 locations.add(new Location(rs.getString("LOCATIONID"), rs.getString("LOCADDRESS")));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
		
		return locations;
	}
	
	public void addUser(User user) {
		//CUSTOMERID,CUSNAME,SURNAME,CADDRESS,BANKACCOUNT,PHONENUMBER,CUSEMAIL
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("add-user"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setString(1,user.getid());
        	ps.setString(2, user.getname());
        	ps.setString(3, user.getsurname());
        	ps.setString(4, user.getaddress());
        	ps.setString(5, user.getbank());
        	ps.setString(6, user.getphone());
        	ps.setString(7, user.getemail());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public void removeUser(String id) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("remove-user"), PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, id);
	        ps.executeUpdate();
		} catch (SQLException e) {
			close();
			System.out.println(e);
		}
	}
	
	public ArrayList<User> listUsers() {
		ArrayList<User> users = new ArrayList<User>();
		
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("list-user"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 users.add(new User(rs.getString("CUSTOMERID"), rs.getString("CUSNAME"), rs.getString("SURNAME"), rs.getString("CADDRESS"), rs.getString("BANKACCOUNT"), rs.getString("PHONENUMBER"), rs.getString("CUSEMAIL")));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
		
		return users;
	}
	
	public void modifyUser(User user) {
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("modify-user"), PreparedStatement.RETURN_GENERATED_KEYS);
	         ps.setString(1, user.getname());
	         ps.setString(2, user.getsurname());
	         ps.setString(3, user.getaddress());
	         ps.setString(4, user.getbank());
	         ps.setString(5, user.getphone());
	         ps.setString(6, user.getemail());
	         ps.setString(7,user.getid());
	         ps.executeUpdate();
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
	}
	
	public void addWorker(Worker worker) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("add-worker"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setString(1, worker.getid());
        	ps.setString(2, worker.getname());
        	ps.setString(3, worker.getsurname());
        	ps.setString(4, worker.getrole());
        	ps.setString(5, worker.getphone());
        	ps.setString(6, worker.getemail());
        	ps.setString(7, worker.getlocation());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public void removeWorker(String id) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("remove-worker"), PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, id);
	        ps.executeUpdate();
		} catch (SQLException e) {
			close();
			System.out.println(e);
		}
	}
	
	public ArrayList<Worker> listWorkers() {
		ArrayList<Worker> workers = new ArrayList<Worker>();
		
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("list-worker"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 workers.add(new Worker(rs.getString("WORKERID"), rs.getString("NAM"), rs.getString("SURNAME"), rs.getString("WORKROLE"), rs.getString("PHONENUM"), rs.getString("WEMAIL"), rs.getString("LOCATIONID")));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
		
		return workers;
	}
	
	public void modifyWorker(Worker worker) {
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("modify-worker"), PreparedStatement.RETURN_GENERATED_KEYS);
	         ps.setString(1, worker.getname());
	         ps.setString(2, worker.getsurname());
	         ps.setString(3, worker.getrole());
	         ps.setString(4, worker.getphone());
	         ps.setString(5, worker.getemail());
	         ps.setString(6, worker.getlocation());
	         ps.setString(7, worker.getid());
	         ps.executeUpdate();
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
	}
	
	public int trackTransactions() {
	     
		return 0;
	}
	
	public void addItemLocation(Stock s) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("addItemLocation"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setString(1, s.getlocation());
        	ps.setString(2, s.getitem());
        	ps.setInt(3, s.getquantity());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public void modifyStockLocation(Stock s) {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement(prop.getProperty("modifyStockLocation"), PreparedStatement.RETURN_GENERATED_KEYS);
        	ps.setInt(1, s.getquantity());
        	ps.setString(2, s.getlocation());
        	ps.setString(3, s.getitem());
            ps.executeUpdate();
		} catch (SQLException e) {
            close();
            System.out.println(e);
        }
	}
	
	public ArrayList<Stock> checkLocationsAvailable(String item) {
		ArrayList<Stock> stock = new ArrayList<Stock>();
		
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("checkLocationsAvailable"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ps.setString(1, item);
	    	 ResultSet rs = ps.executeQuery();
			 while (rs.next()) {
				 stock.add(new Stock(rs.getString("LOCATIONID"), rs.getString("ITEMID"), rs.getInt("QUANTITY")));
			 }
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
		
		return stock;	     
	}
	
	public void removeItemLocation(Stock s) {
		try {
	    	 Connection con = getConnection();
	    	 PreparedStatement ps = con.prepareStatement(prop.getProperty("removeItemLocation"), PreparedStatement.RETURN_GENERATED_KEYS);
			 ps.setString(1, s.getitem());
			 ps.setString(2, s.getlocation());
	         ps.executeUpdate();
	     } catch (SQLException e) {
	    	 close();
	    	 System.out.println(e);
	     }
	}
}