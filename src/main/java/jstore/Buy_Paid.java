package jstore;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
        this.isActive=false;
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
    
    public String toString()
    {
         setTotalPrice(0);
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
        
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

         return "\n========INVOICE========" +
                "\nID: " +  getId() + 
       //         "\nItem: " + getItem().getName() +
       //         "\nAmount: "  + getTotalItem() +
                //"\nBuy date: " + sdf.format(getDate().getTime()) +
       //         "\nPrice: " + getItem().getPrice() +
                "\nTotal price: " + getTotalPrice() +
       //         "\nSupplier ID: " + getItem().getSupplier().getId() +
       //         "\nSupplier name: " + getItem().getSupplier().getName() +
                "\nStatus: " + InvoiceStatus.Paid + 
                "\nSell Success\n";
    }
}
