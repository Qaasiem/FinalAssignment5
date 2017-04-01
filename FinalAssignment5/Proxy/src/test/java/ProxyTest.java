import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class ProxyTest extends TestCase
{
    HD h = new HD("CARS");

    public void testMovieTitle() throws Exception
    {
        assertSame(h.view(),"CARS");
    }

    AVI a = new AVI("SNIPER");

    public void testMovieTitle1() throws Exception
    {
        assertSame(a.view(),"SNIPER");
    }
}
