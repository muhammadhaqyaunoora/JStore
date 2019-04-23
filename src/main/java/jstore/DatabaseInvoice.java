package jstore;
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
    private static int LAST_INVOICE_ID=0;

    /**
     * An example of a method - replace this comment with your own
     *
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
    
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
        // put your code here
        for (Invoice invoice1: INVOICE_DATABASE) {
            if ((invoice.getCustomer().equals(invoice1.getCustomer()))) {
                throw new InvoiceAlreadyExistsException(invoice1);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
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
    
    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> Invoice_list = new ArrayList<Invoice>();
        for (Invoice invoiceDB : INVOICE_DATABASE)
        {
            if (invoiceDB.isActive() == true &&
                    customer.equals(invoiceDB.getCustomer()))
            {
                Invoice_list.add(invoiceDB);
            }
        }
        throw new CustomerDoesntHaveActiveException(customer);
    }
    
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(id == invoice.getId())
            {
                if(invoice.isActive())
                {
                    invoice.setIsActive(false);
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
