
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private Invoice[] listInvoice;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean addInvoice(Invoice invoice)
    {
        // put your code here
        return true;
    }
    
    public void removeInvoice(Invoice invoice)
    {
        this.invoice=invoice;
    }
    
    public Invoice getInvoice()
    {
        return invoice;
    }
    
    public Invoice[] getListInvoice()
    {
        return listInvoice;
    }
}
