
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.customer=customer;
        this.dueDate.add(Calendar.DATE,1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
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
            "Due Date:" +this.getDueDate()+
            "Status: "+this.INVOICE_STATUS +"Sell success";
    }
}
