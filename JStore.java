
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JStore
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class JStore
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        Location rumah = new Location("Bogor","Jawa Barat","Kabupaten");
        Supplier pedagang = new Supplier(1,"Haqy","mj@email.com","021123123",rumah);
        Item barang = new Item(1,"Bir",50,10000,"Minuman",pedagang);
        Invoice struk = new Invoice(1,barang,"5 Maret 2019",20000);
        
        String namaPedagang = pedagang.getName();
        System.out.println(namaPedagang);
        pedagang.setName("Ghifari");
        namaPedagang = pedagang.getName();
        System.out.println(namaPedagang);
        barang.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public JStore()
    {
        // put your code here
        
    }
   
}
