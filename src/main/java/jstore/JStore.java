package jstore;
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JStore
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class JStore
     */
    public static void main(String[] args)
    {
        Location loc = new Location("Depok", "Jawa Barat", "Kota");

        Supplier sup1 = new Supplier("Alwi", "alwi@email.com", "02184305768", loc);
        Supplier sup2 = new Supplier("Udin", "udin@email.com", "02184309876", loc);
        Supplier sup3 = new Supplier("Meidi", "Meidi@email.com", "02184301234", loc);

        Item item1 = new Item("LED Strip", ItemStatus.New, 100000, sup1, ItemCategory.Electronics);
        Item item2 = new Item("Desk", ItemStatus.Refurbished, 1000, sup3, ItemCategory.Furniture);
        Item item3 = new Item("Calculator", ItemStatus.Second, 400000, sup2, ItemCategory.Stationery);
        Item item4 = new Item("Resistor", ItemStatus.Sold, 1000, sup1, ItemCategory.Electronics);

        SpringApplication.run(JStore.class, args);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public JStore()
    {
        // put your code here
        
    }
   
}
