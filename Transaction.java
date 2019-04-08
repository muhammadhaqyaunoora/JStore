
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        // put your code here
        //Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
        //if (bp instanceof Sell_Paid)
        //{
        //    System.out.println("Benar Invoice Type adalah Sell_Paid");
        //}
        //else
        //{
        //    System.out.println("Salah Invoice Type bukan Sell_Paid");
        //}
        //item.printData();
        //bp.printData();
    }
    
    public static void orderSecondItem(Item item)
    {
        //Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
        //tem.printData();
        //bp.printData();
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        //Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
        //item.printData();
        //bp.printData();
    }
    
    public static void sellItemPaid(Item item, Customer customer)
    {
        //Invoice sp = new Sell_Paid (2, item, "March 21st 2019", 1, item.getPrice());
        //item.printData();
        //sp.printData();
    }
    
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        //Invoice su = new Sell_Unpaid (3, item, "March 21st 2019", 5, item.getPrice(), "March 31st 2019");
        //item.printData();
        //su.printData();
    }
    
    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod)
    {
        //Invoice si = new Sell_Installment (4, item, "March 21st 2019", 6, item.getPrice(), 12);
        //item.printData();
        //si.printData();
    }
}
