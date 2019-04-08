
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
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
            "Installment Period: "+this.getInstallmentPeriod()+
            "Status: "+this.INVOICE_STATUS +"Sell success";
    }
}
