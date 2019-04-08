
/**
 * Ini adalah kelas DatabaseItem. Kelas ini digunakan untuk
 * database kelas Item.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private Item[] listItem;
    public static Item itemDB;

    /**
     * Method untuk menambah data item
     * 
     * @param item
     * @return    true
     */
    public static boolean addItem(Item item)
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
    public static boolean removeItem(Item item)
    {
        return true;
    }
    
    /**
     * Method untuk menambah data
     * 
     * @return    item
     */
    public static Item getItem()
    {
        return itemDB;
    }
    
    /**
     * Method untuk menambah data itemDatabase
     * 
     * @return    listItem
     */
    public Item[] getItemDatabase()
    {
        return listItem;
    }
}
