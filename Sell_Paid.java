
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.customer=customer;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public String toString()
    {
        return "===== INVOICE =====" +
            "ID: "+this.getId() +
            "Item: "+this.getItem().getName() +
            "Amount:" +this.getTotalItem()+
            "Buy Date: "+this.getDate() +
            "Price: " + this.getItem().getPrice()+
            "Total Price: " +this.getTotalPrice() +
            "Supplier ID: " +this.getItem().getSupplier().getId()+
            "Supplier Name: " +this.getItem().getSupplier().getName()+
            "Customer ID: " +this.getCustomer().getId()+
            "Customer Name: " +this.getCustomer().getName()+
            "Status: "+this.INVOICE_STATUS +"Sell success";
    }
}
