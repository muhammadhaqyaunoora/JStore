
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * Constructor for objects of class Item
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
    
    public String getName()
    {
        return name;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public void printData()
    {
        System.out.println("Item ID: "+id);
        System.out.println("Item Name: "+name);
        System.out.println("Stock: "+stock);
        System.out.println("Category: "+category);
        System.out.println("Supplier: "+supplier);
    }
}
