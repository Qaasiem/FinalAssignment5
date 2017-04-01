import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class VisitorTest extends TestCase
{
    ClothingShop c = new Suit();
    ClothingShop c1 = new Blazer();
    ClothingShop c2= new Pants();
    ClothingShop c3 = new Shirt();
    public void testSuit() throws Exception
    {
        c.welcome((new ClothingShopVisiterView()));
    }

    public void testBlazer() throws Exception
    {
        c1.welcome((new ClothingShopVisiterView()));
    }

    public void testPants() throws Exception
    {
        c2.welcome((new ClothingShopVisiterView()));
    }

    public void testShirt() throws Exception
    {
        c3.welcome((new ClothingShopVisiterView()));
    }
}
