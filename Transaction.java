
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Transaction
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void orderSecondItem(Item item)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv); 
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Buy_Paid(temp);
        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemPaid(Item item, Customer customer)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Paid(temp, customer);
        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Unpaid(temp, customer);
        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(item.getId());
        Invoice inv = new Sell_Installment(temp,12,customer);
        DatabaseInvoice.addInvoice(inv);
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        ArrayList<Invoice> invDb = DatabaseInvoice.getInvoiceDatabase();
        for(int i=0;i<invDb.size();i++)
        {
            if(invDb.get(i).getId()==invoice.getId())
            {
                invoice.setIsActive(false);
                invDb.set(i,invoice);
                System.out.println(invoice.toString());
                return true;
            }
        }
        return false;
    }
    
    public boolean cancelTransaction(Invoice invoice)
    {
        ArrayList<Invoice> invDb = DatabaseInvoice.getInvoiceDatabase();
        for(Invoice inv : invDb)
        {
            if(inv.getId() == invoice.getId())
            {
                invDb.remove(inv);
                return true;
            }
        }
        return false;
    }
}
