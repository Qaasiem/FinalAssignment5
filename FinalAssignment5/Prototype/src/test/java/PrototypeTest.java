import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class PrototypeTest extends TestCase
{
    CopyObject co = new Cellphone("samsung");
    public void testType() throws Exception
    {
        assertEquals(co.toString(),"this is a : samsung");
    }

    CopyObject co1 = new Samsung("s7");

    public void testModel() throws Exception
    {
        assertEquals(co1.toString(),"this is a : s7");
    }
}
