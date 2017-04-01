import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class BridgeTest extends TestCase
{

    M5 m = new M5(32,6,6,new N1());

    public void testN1() throws Exception
    {
        m.view();
    }

    M5 n = new M5(19,4,14,new N2());
    public void testN2() throws Exception
    {
        n.view();
    }
}
