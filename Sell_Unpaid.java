
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.ArrayList;

public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.customer=customer;
        this.dueDate.add(Calendar.DATE,1);
        this.isActive=true;
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
        String text = "";
        for (int object : getItem())
        {
            System.out.println(DatabaseItem.getItemFromID(object));
            text = text+object;
        }
        return text;
    }
}
