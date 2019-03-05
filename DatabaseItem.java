
/**
 * Ini adalah kelas DatabaseItem. Kelas ini digunakan untuk
 * database kelas Item.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private Item item;

    /**
     * Konstruktor untuk objek dari kelas DatabaseItem
     */
    public DatabaseItem()
    {
        // initialise instance variables
        String[] listItem;
        Item item;
    }

    /**
     * Method untuk menambah data item
     * 
     * @param item
     * @return    true
     */
    public boolean addItem(Item item)
    {
        // put your code here
        return true;
    }
    
    /**
     * Method untuk menghapus data item
     * 
     * @param item
     * @return    true
     */
    public boolean removeItem(Item item)
    {
        return true;
    }
    
    /**
     * Method untuk menambah data
     * 
     * @return    item
     */
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method untuk menambah data itemDatabase
     * 
     * @return    listItem
     */
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
