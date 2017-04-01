/**
 * Created by qaasiem on 2017-04-01.
 */
public class StockControl
{
    private BookShop bs;

    public StockControl(BookShop bs){
        this.bs = bs;
    }

    public int bookShopSale(int stock, int bookA){
        return bs.sales(bookA, stock);
    }
}
