
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

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
        DatabaseSupplier.addSupplier(new Supplier("Haqy","haqy@email.com","021123123",lokasi));
        DatabaseSupplier.addSupplier(new Supplier("Naufal","naufal@email.com","021456456",lokasi));
        DatabaseSupplier.addSupplier(new Supplier("Alhuda","alhuda@email.com","021789789",lokasi));
        ArrayList<Supplier> tempSupplier = DatabaseSupplier.getSupplierDatabase();
        for(Supplier temp : tempSupplier)
        {
         //   System.out.println(temp);
        }
        
        DatabaseCustomer.addCustomer(new Customer("Jihad","jihad@email.com","Jihad123","Jihad123", 1998, 01, 1));
        DatabaseCustomer.addCustomer(new Customer("Fathur","fathur@email.com","Fathur123","Fathur123", 1998, 01, 1));
        DatabaseCustomer.addCustomer(new Customer("Rizky","rizky@email.com","Rizky123","Rizky123", 1998, 01, 1));
        ArrayList<Customer> tempCustomer = DatabaseCustomer.getCustomerDatabase();
        for(Customer temp : tempCustomer)
        {
         //   System.out.println(temp);
        }
        
        DatabaseItem.addItem(new Item("Halogen Bulb", 100, ItemStatus.New, 5000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
        DatabaseItem.addItem(new Item("Rocking Chair", 10, ItemStatus.Refurbished, 1000000, ItemCategory.Furniture, DatabaseSupplier.getSupplier(2)));
        DatabaseItem.addItem(new Item("Scientific Calculator", 5, ItemStatus.Second, 30000, ItemCategory.Stationery, DatabaseSupplier.getSupplier(3)));
        DatabaseItem.addItem(new Item("Zybo", 1, ItemStatus.Sold, 3700000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();
        for(Item temp : tempItem)
        {
        //    System.out.println(temp);
        }
        
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(item, 12, DatabaseCustomer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(3)));
        ArrayList<Invoice> tempInvoice = DatabaseInvoice.getInvoiceDatabase();
        for(Invoice temp : tempInvoice)
        {
            System.out.println(temp);
        }
        //Item benda = new Item(1, "LED", 10,  ItemStatus.New, 1000, ItemCategory.Electronics, penyuplai1);
        //DatabaseItem.itemDB = benda;
        //Transaction transaction = new Transaction();
        //transaction.orderNewItem(benda);
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
