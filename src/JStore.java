
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
        try {
            DatabaseSupplier.addSupplier(new Supplier("Haqy","haqy@email.com","021123123",lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Haqy","haqy@email.com","021123123",lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Alhuda","alhuda@email.com","021789789",lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.removeSupplier(100);
        } catch (SupplierNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        ArrayList<Supplier> tempSupplier = DatabaseSupplier.getSupplierDatabase();
        for(Supplier temp : tempSupplier)
        {
         //   System.out.println(temp);
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Jihad","jihad@email.com","Jihad123","Jihad123", 1998, 01, 1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(new Customer("Jihad","jihad@email.com","Jihad123","Jihad123", 1998, 01, 1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(new Customer("Rizky","rizky@email.com","Rizky123","Rizky123", 1998, 01, 1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.removeCustomer(100);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        ArrayList<Customer> tempCustomer = DatabaseCustomer.getCustomerDatabase();
        for(Customer temp : tempCustomer)
        {
         //   System.out.println(temp);
        }

        try {
            DatabaseItem.addItem(new Item("Halogen Bulb", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Halogen Bulb", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Scientific Calculator", ItemStatus.Second, 30000, DatabaseSupplier.getSupplier(3), ItemCategory.Stationery));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.removeItem(100);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getExMessage());
        }
//        try {
//            DatabaseItem.addItem(new Item("Zybo", ItemStatus.Sold, 3700000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
//        } catch (ItemAlreadyExistsException e) {
//            System.out.println(e.getExMessage());
//        }
        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();
        for(Item temp : tempItem)
        {
        //    System.out.println(temp);
        }
        
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(item, 12, DatabaseCustomer.getCustomer(2)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.removeInvoice(100);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(1));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }
//        ArrayList<Invoice> tempInvoice = DatabaseInvoice.getInvoiceDatabase();
//        for(Invoice temp : tempInvoice)
//        {
//            System.out.println(temp);
//        }
        //Item benda = new Item(1, "LED", 10,  ItemStatus.New, 1000, ItemCategory.Electronics, penyuplai1);
        //DatabaseItem.itemDB = benda;
        //Transaction transaction = new Transaction();
        //transaction.orderNewItem(benda);
        //transaction.sellItemPaid(benda);
        //transaction.sellItemUnpaid(benda);
        //transaction.sellItemInstallment(benda);
        System.out.println(DatabaseSupplier.getSupplierDatabase());
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseItem.getItemDatabase());
        System.out.println(DatabaseInvoice.getInvoiceDatabase());
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
