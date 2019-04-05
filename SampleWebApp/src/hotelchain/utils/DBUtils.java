package hotelchain.utils;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hotelchain.beans.Hotel;
import hotelchain.beans.HotelChain;
import hotelchain.beans.Product;
import hotelchain.beans.Room;
import hotelchain.beans.Customer;
import hotelchain.beans.Employee;
 
public class DBUtils {
 
    public static Customer findUser(Connection conn, 
            String userName) throws SQLException {
 
        String sql = "Select a.SIN, a.NAME, a.CUSTOMER_ADDRESS, a.ENTRY_DATE, a.CUSTOMER_PASSWORD "
        		+ "from CUSTOMER a "
        		+ "where a.NAME = ?;";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        System.out.println("IN DB username " + userName);
        pstm.setString(1, userName);
        

        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	String password = rs.getString("CUSTOMER_PASSWORD");
        	System.out.println("PASS" + password);
            Customer user = new Customer();
            user.setName(userName);
            user.setPassword(password);
            return user;
        }
        return null;
    }
 
    /*public static Customer findUser(Connection conn, String userName) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "//
                + " where a.User_Name = ? ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
 
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String password = rs.getString("Password");
            String gender = rs.getString("Gender");
            Customer user = new Customer();
            user.setName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }*/
 
    public static List<Product> queryProduct(Connection conn) throws SQLException {
        String sql = "Select a.Code, a.Name, a.Price from Product a ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Product> list = new ArrayList<Product>();
        while (rs.next()) {
            String code = rs.getString("Code");
            String name = rs.getString("Name");
            float price = rs.getFloat("Price");
            Product product = new Product();
            product.setCode(code);
            product.setName(name);
            product.setPrice(price);
            list.add(product);
        }
        return list;
    }
    
    
    
    public static List<Room> queryRoom(Connection conn) throws SQLException {
        String sql = "Select a.ROOM_NUM, a.PRICE, a.VIEW, a.EXTENDABLE, a.CAPACITY,"
        		+ "a.DAMAGES, a.HOTEL_ID from Room a ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Room> list = new ArrayList<Room>();
        while (rs.next()) {
        	String roomNum = rs.getString("ROOM_NUM");
        	double price = rs.getDouble("PRICE");
        	String view = rs.getString("VIEW");
        	boolean extendable = rs.getBoolean("EXTENDABLE");
        	String capacity = rs.getString("CAPACITY");
        	String damages = rs.getString("DAMAGES");
        	String hotelID = rs.getString("HOTEL_ID");


            Room room = new Room();
            room.setRoomNum(roomNum);
            room.setPrice(price);
            room.setCapacity(capacity);
            room.setView(view);
            room.setExtendable(extendable);
            room.setDamages(damages);
            room.setHotelID(hotelID);
                      
            list.add(room);
        }
        return list;
    }
    
    public static List<Hotel> queryHotel(Connection conn) throws SQLException {
        String sql = "Select a.HOTEL_ID, a.EMAIL_ADDRESS, a.NUM_ROOMS, a.RATING, a.HOTEL_ADDRESS,"
        		+ " a.PHONE_NUMBERS, a.HOTEL_NAME from Hotel a ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        
        
        ResultSet rs = pstm.executeQuery();
        List<Hotel> list = new ArrayList<Hotel>();
        while (rs.next()) {
            String hotelID = rs.getString("HOTEL_ID");
            String email = rs.getString("EMAIL_ADDRESS");
            int numRooms = rs.getInt("NUM_ROOMS");
            float rating = rs.getFloat("RATING");
            String hotel_address = rs.getString("HOTEL_ADDRESS");
            String phoneNumber = rs.getString("PHONE_NUMBERS");
            String hotelName = rs.getString("HOTEL_NAME");
            
            Hotel hotel = new Hotel();
            
            System.out.println("COUNTRY : " + hotel_address);
            hotel.setEmail_Address(email);
            hotel.setHotelID(hotelID);
            hotel.setNumRooms(numRooms);
            hotel.setRating(rating);
            hotel.setHotel_name(hotelName);
            hotel.setPhoneNumbers(phoneNumber);
            hotel.setHotel_address(hotel_address);
            System.out.println("RATiNG : " + rating);
         
            list.add(hotel);
        }
        return list;
    }
    
    public static List<Hotel> querySameHotels(Connection conn, String name) throws SQLException {
        String sql = "Select a.HOTEL_ID, a.EMAIL_ADDRESS, a.NUM_ROOMS, a.RATING, a.HOTEL_ADDRESS,"
        		+ " a.PHONE_NUMBERS, a.HOTEL_NAME from Hotel a WHERE a.HOTEL_NAME = '" + name +"';";
        System.out.println("SQUEAL " + sql);
        
           
        PreparedStatement pstm = conn.prepareStatement(sql);        
        
        ResultSet rs = pstm.executeQuery();
        
        List<Hotel> list = new ArrayList<Hotel>();
        while (rs.next()) {
            String hotelID = rs.getString("HOTEL_ID");
            String email = rs.getString("EMAIL_ADDRESS");
            int numRooms = rs.getInt("NUM_ROOMS");
            float rating = rs.getFloat("RATING");
            String hotel_address = rs.getString("HOTEL_ADDRESS");
            String phoneNumber = rs.getString("PHONE_NUMBERS");
            String hotelName = rs.getString("HOTEL_NAME");
            
            Hotel hotel = new Hotel();
            
            System.out.println("COUNTRY : " + hotel_address);
            hotel.setEmail_Address(email);
            hotel.setHotelID(hotelID);
            hotel.setNumRooms(numRooms);
            hotel.setRating(rating);
            hotel.setHotel_name(hotelName);
            hotel.setPhoneNumbers(phoneNumber);
            hotel.setHotel_address(hotel_address);
            System.out.println("RATiNG : " + rating);
         
            list.add(hotel);
        }
        return list;
    }
    
    public static List<HotelChain> queryHotelChain(Connection conn) throws SQLException {
        String sql = "Select a.NAME, a.HOTEL_ADDRESS, a.NUM_HOTELS, "
        		+ "a.EMAIL_ADDRESS, a.PHONE_NUMBER from Hotel_chain a;";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<HotelChain> list = new ArrayList<HotelChain>();
        while (rs.next()) {
        	String name = rs.getString("NAME");
        	String hotelAddress= rs.getString("HOTEL_ADDRESS");
        	int numHotels= rs.getInt("NUM_HOTELS");
        	String emailAddress= rs.getString("EMAIL_ADDRESS");
        	String phoneNumbers= rs.getString("PHONE_NUMBER");
            
 
            HotelChain hotelChain = new HotelChain();
            System.out.println("BName : " + name);
            hotelChain.setName(name);
            hotelChain.setEmailAddress(emailAddress);
            hotelChain.setHotelAddress(hotelAddress);            
            hotelChain.setNumHotels(numHotels);
            hotelChain.setPhoneNumbers(phoneNumbers);
            System.out.println("phoneNumbers : " + phoneNumbers);
         
            list.add(hotelChain);
        }
        return list;
    }
 
    public static Product findProduct(Connection conn, String code) throws SQLException {
        String sql = "Select a.Code, a.Name, a.Price from Product a where a.Code=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, code);
 
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            String name = rs.getString("Name");
            float price = rs.getFloat("Price");
            Product product = new Product(code, name, price);
            return product;
        }
        return null;
    }
 
    public static void updateProduct(Connection conn, Product product) throws SQLException {
        String sql = "Update Product set Name =?, Price=? where Code=? ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, product.getName());
        pstm.setFloat(2, product.getPrice());
        pstm.setString(3, product.getCode());
        pstm.executeUpdate();
    }
 
    public static void insertProduct(Connection conn, Product product) throws SQLException {
        String sql = "Insert into Product(Code, Name,Price) values (?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, product.getCode());
        pstm.setString(2, product.getName());
        pstm.setFloat(3, product.getPrice());
 
        pstm.executeUpdate();
    }
    
    public static void insertHotel(Connection conn, Hotel hotel) throws SQLException {
    	String sql = "INSERT INTO HOTEL (HOTEL_ID, EMAIL_ADDRESS, NUM_ROOMS, RATING, "
    			+ "HOTEL_ADDRESS, PHONE_NUMBERS, HOTEL_NAME)\r\n" + 
    			"VALUES (?,?, ?, ?, ?, ?, ?);";
    	
    	PreparedStatement pstm = conn.prepareStatement(sql);
    	 
        pstm.setString(1, hotel.getHotelID());
        pstm.setString(2, hotel.getEmail_Address());
        pstm.setInt(3, hotel.getNumRooms());
        pstm.setFloat(4, hotel.getRating());
        pstm.setString(5, hotel.getHotel_address());
        pstm.setString(6, hotel.getPhoneNumbers());
        pstm.setString(7, hotel.getHotel_name());
        

 
        pstm.executeUpdate();    	
    	
    }
 
    public static void deleteProduct(Connection conn, String code) throws SQLException {
        String sql = "Delete From Product where Code= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, code);
 
        pstm.executeUpdate();
    }

	public static Employee findEmployee(Connection conn, String userName) throws SQLException {
		String sql = "Select a.SIN, a.NAME, a.ROLE, a.EMPLOYEE_ADDRESS, a.HOTEL_ID "
        		+ "from EMPLOYEE a "
        		+ "where a.NAME = ?;";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        System.out.println("IN DB username " + userName);
        pstm.setString(1, userName);
        

        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	String sin = rs.getString("SIN");
        	System.out.println("PASS SIN NUMBER" + sin);
            Employee user = new Employee();
            user.setName(userName);
            user.setSin(sin);
            return user;
        }
        return null;
    }

	public static List<Room> queryHotelRooms(Connection conn, String hotelID) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "Select a.ROOM_NUM, a.PRICE, a.VIEW" + 
				",a.EXTENDABLE, a.CAPACITY, a.AMMENITIES, a.DAMAGES," + 
				"a.HOTEL_ID, a.STATUS from ROOM a WHERE a.HOTEL_ID ='" + hotelID + "'AND STATUS='Available';";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Room> list = new ArrayList<Room>();
        while (rs.next()) {
        	String roomNum = rs.getString("ROOM_NUM");
        	double price = rs.getDouble("PRICE");
        	String view = rs.getString("VIEW");
        	boolean extendable = rs.getBoolean("EXTENDABLE");
        	String capacity = rs.getString("CAPACITY");
        	String ammenities = rs.getString("AMMENITIES");
        	String damages = rs.getString("DAMAGES");
        	String hotelId = rs.getString("HOTEL_ID");
        	String status = rs.getString("STATUS");

           
            Room room = new Room();
            System.out.println("Room : " + roomNum);
            room.setCapacity(capacity);
            room.setDamages(damages);
            room.setHotelID(hotelId);           
            room.setExtendable(extendable);
            room.setView(view);
            room.setAmmenities(ammenities);
            room.setRoomNum(roomNum);
            room.setPrice(price);
            room.setStatus(status);
            System.out.println("ammenities : " + ammenities);
         
            list.add(room);
        }
        return list;
	}

	public static String findPassword(Connection conn, String userName) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "Select a.SIN, a.NAME, a.CUSTOMER_ADDRESS, a.ENTRY_DATE, a.CUSTOMER_PASSWORD "
        		+ "from CUSTOMER a "
        		+ "where a.NAME = ?;";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        System.out.println("IN DB username " + userName);
        pstm.setString(1, userName);
        

        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
        	String password = rs.getString("CUSTOMER_PASSWORD");
        	System.out.println("PASS" + password);
            return password;
        }
        return null;
	}
 
}