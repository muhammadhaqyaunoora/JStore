
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice()
    {
        // initialise instance variables
        int id;
        Item item;
        String date;
        int totalPrice;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void printData()
    {
        System.out.println("Transaction ID: "+id);
        System.out.println("Item: "+item);
        System.out.println("Date: "+date);
        System.out.println("Total: "+totalPrice);
    }
}
