
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private final static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<>();
    private static int LAST_CUSTOMER_ID=0;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    
    public static boolean addCustomer(Customer customer)
    {
        // put your code here
        boolean success = true;
        for(Customer object : CUSTOMER_DATABASE)
        {
            if(object.getName().equals(customer.getName()) && object.getEmail().equals(customer.getEmail()))
            {
                success = false;
                break;
            }
            else
            {
                success = true;
            }
        }
        if (success)
        {
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID = customer.getId();
        }
        return success;
    }
    
    public static Customer getCustomer(int id)
    {
        Customer value = null;
        for(Customer object : CUSTOMER_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                break;
            }
        }
        return value;
    }
    
    public boolean removeCustomer(int id)
    {
        Customer value = null;
        int index;
        boolean success = false;
        for(Customer object : CUSTOMER_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                index = CUSTOMER_DATABASE.indexOf(value);
                CUSTOMER_DATABASE.remove(index);
                success = true;
                break;
            }
        }
        return success;
    }
}
