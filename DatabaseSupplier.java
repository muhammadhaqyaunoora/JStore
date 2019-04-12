
/**
 * Ini adalah kelas DatabaseSupplier. Kelas ini digunakan untuk 
 * database kelas Supplier.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
import java.util.ArrayList;

public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private final static ArrayList<Supplier> SUPPLIER_DATABASE=new ArrayList<>();
    private static int LAST_SUPPLIER_ID=0;

    /**
     * Method untuk menambah data supplier
     * 
     * @param supplier
     * @return    true
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        // put your code here
        boolean success = true;
        for(Supplier object : SUPPLIER_DATABASE)
        {
            if(object.getName().equals(supplier.getName()) && object.getEmail().equals(supplier.getEmail()) && object.getPhoneNumber().equals(supplier.getPhoneNumber()))
            {
                success = false;
                break;
            }
            else
            {
                success = true;
            }
        }
        if (success)
        {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID = supplier.getId();
        }
        return success;
    }
    
    public static Supplier getSupplier(int id)
    {
        Supplier value = null;
        for(Supplier object : SUPPLIER_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                break;
            }
        }
        return value;
    }
    
    /**
     * Method untuk menghapus data supplier
     * 
     * @param supplier
     * @return    true
     */
    public boolean removeSupplier(int id)
    {
        Supplier value = null;
        int index;
        boolean success = false;
        for(Supplier object : SUPPLIER_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                index = SUPPLIER_DATABASE.indexOf(value);
                SUPPLIER_DATABASE.remove(index);
                success = true;
                break;
            }
        }
        return success;
    }
}
