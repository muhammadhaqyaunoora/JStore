
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        this.isActive=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
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
    
    public void setInstallmentPrice()
    {
    //    installmentPrice=totalPrice/installmentPeriod*102/100;
    }
    
    public void setTotalPrice()
    {
    //    totalPrice=installmentPrice*installmentPeriod;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
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
