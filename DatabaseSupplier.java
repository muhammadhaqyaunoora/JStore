
/**
 * Ini adalah kelas DatabaseSupplier. Kelas ini digunakan untuk 
 * database kelas Supplier.
 * @author (Muhammad Haqy Aunoora)
 * @version (28 Februari 2019)
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private Supplier[] listSupplier;

    /**
     * Method untuk menambah data supplier
     * 
     * @param supplier
     * @return    true
     */
    public boolean addSupplier(Supplier supplier)
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
    public void removeSupplier(Supplier supplier)
    {
        this.supplier=supplier;
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
     */public Supplier[] getListSupplier()
    {
        return listSupplier;
    }
}
