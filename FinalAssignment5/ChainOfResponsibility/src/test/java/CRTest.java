import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class CRTest extends TestCase
{
    Manager emp1 = new Employee1();
    Manager emp2 = new Employee2();
    Manager emp3 = new Employee3();
    public void testEmp1Rating() throws Exception
    {
        assertEquals(emp1.managerRating(8),"8% bonus");
    }

    public void testEmp2Rating() throws Exception
    {
        assertEquals(emp2.managerRating(7),"5% bonus");
    }

    public void testEmp3Rating() throws Exception
    {
        assertEquals(emp3.managerRating(4),"3% bonus");
    }
}
