
/**
 * Ini adalah kelas DatabaseSupplier. Kelas ini digunakan untuk 
 * database kelas Supplier.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private String[] listSupplier;
    private Supplier supplier;

    /**
     * Konstruktor untuk objek dari kelas DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        // initialise instance variables
        String[] listSupplier;
        Supplier supplier;
    }

    /**
     * Method untuk menambah data supplier
     * 
     * @param supplier
     * @return    true
     */
    public static boolean addSupplier(Supplier supplier)
    {
        // put your code here
        return true;
    }
    
    /**
     * Method untuk menghapus data supplier
     * 
     * @param supplier
     * @return    true
     */
    public boolean removeSupplier(Supplier supplier)
    {
        return true;
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
     * Method getter untuk mengambil data
     * 
     * @return    listSupplier
     */public String[] getListSupplier()
    {
        return listSupplier;
    }
}
