import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class StrategyTest extends TestCase
{
    StockControl sc = new StockControl(new Sell());
    StockControl sc1 = new StockControl(new Buy());
    public void testSell() throws Exception
    {
        assertEquals(sc.bookShopSale(86,1),85);
    }

    public void testBuy() throws Exception
    {
        assertEquals(sc1.bookShopSale(101,21),122);
    }
}
