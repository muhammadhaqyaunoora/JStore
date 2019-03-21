
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod=installmentPeriod;
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
        installmentPrice=totalPrice/installmentPeriod*102/100;
    }
    
    public void setTotalPrice()
    {
        totalPrice=installmentPrice*installmentPeriod;
    }
    
    public void printData()
    {
        System.out.println("=====Invoice=====");
        System.out.println("Total: "+totalPrice);
        System.out.println("Status: "+INVOICE_STATUS);
        System.out.println("Type: "+INVOICE_TYPE);
        System.out.println("Installment Price: "+installmentPrice);
    }
}
