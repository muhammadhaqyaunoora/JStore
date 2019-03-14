
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JStore
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class JStore
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        Location location = new Location("Bogor","Jawa Barat","Kabupaten");
        Supplier supplier = new Supplier(1,"Haqy","haqy@email.com","021123123",location);
        location.printData();
        supplier.printData();
        Transaction transaction = new Transaction();
        transaction.orderNewItem(supplier);
        transaction.orderSecondItem(supplier);
        transaction.orderRefurbishedItem(supplier);
        transaction.sellITemPaid(DatabaseItem.itemDB);
        transaction.sellItemUnpaid(DatabaseItem.itemDB);
        transaction.sellItemInstallment(DatabaseItem.itemDB);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public JStore()
    {
        // put your code here
        
    }
   
}
