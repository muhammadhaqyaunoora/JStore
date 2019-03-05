
/**
 * Ini adalah kelas Item. Kelas ini digunakan untuk mendata
 * barang dan hal-hal yang bersangkutan dengannya.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    /**
     * Konstruktor untuk objek dari kelas Item
     */
    public Item()
    {
        // initialise instance variables
        int id;
        String name;
        int stock;
        int price;
        String category;
        Supplier suplier;
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
     * @return    name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    stock
     */
    public int getStock()
    {
        return stock;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    category
     */
    public String getCategory()
    {
        return category;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
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
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param stock 
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param price 
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param category 
     */
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    /**
     * Method printData untuk memunculkan data
     */
    public void printData()
    {
        System.out.println("Item ID: "+id);
        System.out.println("Item Name: "+name);
        System.out.println("Stock: "+stock);
        System.out.println("Category: "+category);
        System.out.println("Supplier: "+supplier);
    }
}
