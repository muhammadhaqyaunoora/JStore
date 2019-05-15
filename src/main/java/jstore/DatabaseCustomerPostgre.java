package jstore;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatabaseCustomerPostgre {
    public static boolean insertCustomer(Customer customer){
        Connection c = DatabaseConnectionPostgre.connection();
        boolean success = true;
        Statement stmt = null;

        try {
            stmt = c.createStatement();
            String sql = "INSERT INTO customer (id,name,email,username,password,birthdate) VALUES("+customer.getId()+customer.getName()+customer.getEmail()+customer.getUsername()+customer.getPassword()+customer.getBirthDate()+");";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return success;
    }

    public static int getLastCustomerId(){
        int value=0;
        Connection c = DatabaseConnectionPostgre.connection();
        Statement stmt = null;

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) AS id FROM customer;");
            while (rs.next()){
                value = rs.getInt("id");
            }
            rs.close();
            stmt.close();
            c.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return value;
    }

    public static Customer getCustomer(int id){
        Customer value = null;
        Connection c = DatabaseConnectionPostgre.connection();
        Statement stmt = null;

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE id = "+id+";");
            while (rs.next()){
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Date birthdate = rs.getDate("birthdate");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(birthdate);
                value = new Customer(id, name, email, username, password, calendar);
            }
            rs.close();
            stmt.close();
            c.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return value;
    }

    public static boolean removeCustomer(int id){
        Connection c = DatabaseConnectionPostgre.connection();
        boolean success = true;
        Statement stmt = null;

        try{
            stmt = c.createStatement();
            String sql = "DELETE FROM customer WHERE ID = "+id+";";
            stmt.executeUpdate(sql);
            c.commit();
            stmt.close();
            c.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

        return success;
    }
}
