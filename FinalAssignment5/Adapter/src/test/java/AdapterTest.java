import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class AdapterTest extends TestCase
{
    CarKm ce = new CarKm();
    // MaxSpeed m = new MaxSpeed(200);


    public void testKmToMiles() throws Exception
    {
        assertEquals(ce.getKmToMeters().getkm(),60);
    }

    public void testKmToMeters() throws Exception
    {
        assertEquals(ce.getKmToMiles().getkm(),300);
    }
}
