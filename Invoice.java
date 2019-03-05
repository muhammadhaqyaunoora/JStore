
/**
 * Ini adalah kelas Invoice. Kelas ini digunakan untuk
 * membuat invoice.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    /**
     * Konstruktor untuk objek dari kelas Invoice
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
    public String getDate()
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
    public void setDate(String date)
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
    
    /**
     * Method printData untuk memunculkan data
     */
    public void printData()
    {
        System.out.println("Transaction ID: "+id);
        System.out.println("Item: "+item);
        System.out.println("Date: "+date);
        System.out.println("Total: "+totalPrice);
    }
}
