import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class TestCar extends TestCase
{
    Car c = Car.getInstance();
    public void testColour() throws Exception
    {
        assertEquals(c.colour("white"),"white");
    }

    public void testModel() throws Exception
    {
        assertEquals(c.model(2016), 2016);
    }

    public void testMake() throws Exception
    {
        assertEquals(c.make("Audi"),"Audi");
    }
}

