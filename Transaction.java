
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
    public void orderNewItem(Item item)
    {
        // put your code here
        Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
        if (bp instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell_Paid");
        }
    }
    
    public void orderSecondItem(Item item)
    {
        Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
    }
    
    public void orderRefurbishedItem(Item item)
    {
        Invoice bp = new Buy_Paid (1, item, "March 21st 2019", 3, item.getPrice());
    }
    
    public void sellItemPaid(Item item)
    {
        Invoice sp = new Sell_Paid (2, item, "March 21st 2019", 1, item.getPrice());
        item.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        Invoice su = new Sell_Unpaid (3, item, "March 21st 2019", 5, item.getPrice(), "March 31st 2019");
        item.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        Invoice si = new Sell_Installment (4, item, "March 21st 2019", 6, item.getPrice(), 12);
        item.printData();
    }
}
