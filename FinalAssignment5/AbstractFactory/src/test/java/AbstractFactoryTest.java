import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class AbstractFactoryTest extends TestCase
{
    Carnivore c = new Carnivore();
    Herbivores h = new Herbivores();

    public void testAnimalName1() throws Exception
    {
        assertEquals(c.getAnimalName("siteA").getAnimalName(),"Lion");
    }

    public void testAnimalName2() throws Exception
    {
        assertEquals(c.getAnimalName("siteC").getAnimalName(),"Bear");
    }

    public void testAnimalName3() throws Exception
    {
        assertEquals(h.getAnimalName("siteB").getAnimalName(),"Elephant");
    }

    public void testAnimalName4() throws Exception
    {
        assertEquals(h.getAnimalName("siteD").getAnimalName(),"Buffalo");
    }

}
