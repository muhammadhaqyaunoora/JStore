package jstore;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Transaction
{
    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    public static void orderNewItem(ArrayList<Integer> item_list)
    {
        //ArrayList<Integer> temp = new ArrayList<>();
        //temp.add(item.getId());
        //Invoice inv = new Buy_Paid(temp);
        //DatabaseInvoice.addInvoice(inv);
    }
    
    public static void orderSecondItem(ArrayList<Integer> item_list)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
//        //temp.add(item.getId());
//        Invoice inv = new Buy_Paid(temp);
//        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void orderRefurbishedItem(ArrayList<Integer> item_list)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
//        //temp.add(item.getId());
//        Invoice inv = new Buy_Paid(temp);
//        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
//        //temp.add(item.getId());
//        Invoice inv = new Sell_Paid(temp, customer);
//        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
//        //temp.add(item.getId());
//        Invoice inv = new Sell_Unpaid(temp, customer);
//        DatabaseInvoice.addInvoice(inv);
    }
    
    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
//        //temp.add(item.getId());
//        Invoice inv = new Sell_Installment(temp,12,customer);
//        DatabaseInvoice.addInvoice(inv);
    }
    
    public static boolean finishTransaction(Invoice invoice)
    {
        for (Invoice invo : DatabaseInvoice.getInvoiceDatabase()){
            if(invo == invoice){
                if (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) || invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)){
                    invo.setIsActive(false);
                    //invoice1.set(i,invoice);
                    //System.out.println(invo.getIsActive());
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean cancelTransaction(Invoice invoice)
    {
        for (Invoice invo : DatabaseInvoice.getInvoiceDatabase()){
            if(invo == invoice){
                if (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid) || invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)){
                    invo.setIsActive(false);
                    //invoice1.set(i,invoice);
                    //System.out.println(invo.getIsActive());
                    return true;
                }
            }
        }
        return false;
    }
}
