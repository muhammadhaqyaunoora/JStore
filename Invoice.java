
/**
 * Ini adalah kelas Invoice. Kelas ini digunakan untuk
 * membuat invoice.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
import java.util.Calendar;

public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private Calendar date;
    private int totalPrice;
    private int totalItem;
    
    /**
     * Konstruktor untuk objek dari kelas Invoice
     */
    public Invoice(int id, Item item, int totalItem)
    {
        // initialise instance variables
        this.id=id;
        this.item=item;
        this.totalItem=totalItem;
        setTotalPrice(item.getPrice()*totalItem);
    }

    /**
     * Method getter untuk mengambil data
     *
     * @return    id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    item
     */
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    date
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    /**
     * Method setter untuk menentukan data
     *
     * @param id 
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param item 
     */
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param date 
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param totalPrice 
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    //    this.status = status;
    }
    
    public abstract String toString();
}
