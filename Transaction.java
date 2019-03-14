
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
    public void orderNewItem(Supplier supplier)
    {
        // put your code here
        Item item = new Item(2,"LED",100,ItemStatus.New,10000,ItemCategory.Electronics,supplier);
        DatabaseItem.itemDB = item;
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Paid);
        item.setStatus(ItemStatus.New);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        Item item = new Item(2,"LED",100,ItemStatus.Second,10000,ItemCategory.Electronics,supplier);
        DatabaseItem.itemDB = item;
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Second);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        Item item = new Item(2,"LED",100,ItemStatus.Refurbished,10000,ItemCategory.Electronics,supplier);
        DatabaseItem.itemDB = item;
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Refurbished);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.printData();
    }
    
    public void sellITemPaid(Item item)
    {
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Paid);
        invoice.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        item.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Unpaid);
        invoice.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        item.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        Invoice invoice = new Invoice(2,item,"14 Maret 2019",item.getPrice(),10,InvoiceStatus.Installment);
        invoice.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        item.printData();
    }
}
