
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private final static ArrayList<Invoice> INVOICE_DATABASE=new ArrayList<>();
    private final static int LAST_INVOICE_ID=0;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceId()
    {
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        // put your code here
        INVOICE_DATABASE.add(invoice);
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(id == invoice.getId())
            {
                return invoice;
            }
        }
        return null;
    }
    
    public static Invoice getActiveOrder(Customer customer)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(customer == invoice.getCustomer() && invoice.isActive()==true && (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid || invoice.getInvoiceStatus() == InvoiceStatus.Installment))
            {
                return invoice;
            }
        }
        return null;
    }
    
    public boolean removeInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(id == invoice.getId())
            {
                if(invoice.isActive() == true)
                {
                    invoice.setIsActive(false);
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
        }
        return false;
    }
}
