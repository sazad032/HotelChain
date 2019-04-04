package hotelchain.utils;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hotelchain.beans.Hotel;
import hotelchain.beans.Product;
import hotelchain.beans.Room;
import hotelchain.beans.UserAccount;
 
public class DBUtils {
 
    public static UserAccount findUser(Connection conn, 
            String userName, String password) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
                + " where a.User_Name = ? and a.password= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
 
    public static UserAccount findUser(Connection conn, String userName) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "//
                + " where a.User_Name = ? ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
 
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String password = rs.getString("Password");
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
 
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
        String sql = "Select a.HOTEL_ID, a.EMAIL_ADDRESS, a.NUM_ROOMS, a.RATING, a.CITY,"
        		+ "a.COUNTRY, a.PROVINCE, a.STREET_NAME, a.STREET_NUMBER, a.POSTAL_CODE, a.PHONE_NUMBER from Hotel a ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Hotel> list = new ArrayList<Hotel>();
        while (rs.next()) {
            String hotelID = rs.getString("HOTEL_ID");
            String email = rs.getString("EMAIL_ADDRESS");
            int numRooms = rs.getInt("NUM_ROOMS");
            float rating = rs.getFloat("RATING");
            String city = rs.getString("CITY");
            String country = rs.getString("COUNTRY");
            String province = rs.getString("PROVINCE");
            String streetName = rs.getString("STREET_NAME");
            int streetNumber = rs.getInt("STREET_NUMBER");
            String postalCode = rs.getString("POSTAL_CODE");
            String phoneNumber = rs.getString("PHONE_NUMBER");
            Hotel hotel = new Hotel();
            hotel.setCity(city);
            hotel.setCountry(country);
            System.out.println("COUNTRY : " + country);
            hotel.setEmail_Address(email);
            hotel.setHotelID(hotelID);
            hotel.setNumRooms(numRooms);
            hotel.setPhoneNumber(phoneNumber);
            hotel.setPostalCode(postalCode);
            hotel.setProvince(province);
            hotel.setRating(rating);
            System.out.println("RATiNG : " + rating);
            hotel.setStreetName(streetName);
            hotel.setStreetNumber(streetNumber);            
            list.add(hotel);
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
    	String sql = "INSERT INTO HOTEL (HOTEL_ID, EMAIL_ADDRESS,NUM_ROOMS,RATING,CITY,"
    			+ "COUNTRY,PROVINCE,STREET_NAME,STREET_NUMBER,POSTAL_CODE,PHONE_NUMBER)\r\n" 
    			+ "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    	
    	PreparedStatement pstm = conn.prepareStatement(sql);
    	 
        pstm.setString(1, hotel.getHotelID());
        pstm.setString(2, hotel.getEmail_Address());
        pstm.setInt(3, hotel.getNumRooms());
        pstm.setFloat(4, hotel.getRating());
        pstm.setString(5, hotel.getCity());
        pstm.setString(6, hotel.getCountry());
        pstm.setString(7, hotel.getProvince());
        pstm.setString(8, hotel.getStreetName());
        pstm.setInt(9, hotel.getStreetNumber());
        pstm.setString(10, hotel.getPostalCode());
        pstm.setString(11, hotel.getPhoneNumber());

 
        pstm.executeUpdate();    	
    	
    }
 
    public static void deleteProduct(Connection conn, String code) throws SQLException {
        String sql = "Delete From Product where Code= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, code);
 
        pstm.executeUpdate();
    }
 
}