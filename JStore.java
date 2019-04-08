
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
        Location lokasi = new Location("Bogor","Jawa Barat","Kabupaten");
        Supplier penyuplai = new Supplier(1,"Haqy","haqy@email.com","021123123",lokasi);
        Item benda = new Item(1, "LED", 10,  ItemStatus.New, 1000, ItemCategory.Electronics, penyuplai);
        //DatabaseItem.itemDB = benda;
        Transaction transaction = new Transaction();
        transaction.orderNewItem(benda);
        //transaction.sellItemPaid(benda);
        //transaction.sellItemUnpaid(benda);
        //transaction.sellItemInstallment(benda);
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
