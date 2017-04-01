/**
 * Created by qaasiem on 2017-03-31.
 */
public class Car
{
    private static Car c = null;
    private Car()
    {

    }
    public static Car getInstance()
    {
        if(c == null)
        {
            c = new Car();
        }
        return c;
    }
    public String colour(String colour1)
    {
        return colour1;
    }
    public int model(int model1)
    {
        return model1;
    }
    public String make(String make1)
    {
        return make1;
    }
}
