/**
 * Created by qaasiem on 2017-04-01.
 */
public class Buy implements BookShop
{
    @Override
    public int sales(int stock, int bookA) {
        return bookA + stock;
    }
}
