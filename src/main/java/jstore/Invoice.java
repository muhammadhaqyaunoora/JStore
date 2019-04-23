package jstore;
/**
 * Ini adalah kelas Invoice. Kelas ini digunakan untuk
 * membuat invoice.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
import java.util.Calendar;
import java.util.ArrayList;

public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer; 
    
    /**
     * Konstruktor untuk objek dari kelas Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.id=DatabaseInvoice.getLastInvoiceId()+1;
        this.item=item;
        //setTotalPrice(item.getPrice()*totalItem);
    }

    /**
     * Method getter untuk mengambil data
     *
     * @return    id
     */
    public int getId()
    {
        // put your code here
        return this.id;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    item
     */
    public ArrayList<Integer> getItem()
    {
        return this.item;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    date
     */
    public Calendar getDate()
    {
        return this.date;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    totalPrice
     */
    public int getTotalPrice()
    {
        return this.totalPrice;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    public boolean isActive()
    {
        return this.isActive;
    }
    
    public Customer getCustomer()
    {
        return this.customer;
    }
    
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
    public void setItem(ArrayList<Integer> item)
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
        int price = 0;
        for(Item object : DatabaseItem.getItemDatabase())
        {
            price = price+object.getPrice();
        }
        this.totalPrice = price;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        //this.status = status;
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    public abstract String toString();
}
