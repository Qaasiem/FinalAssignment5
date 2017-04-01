/**
 * Created by qaasiem on 2017-03-31.
 */
public class Cellphone implements CopyObject
{
    private String type;

    public Cellphone(String type)
    {
        this.type = type;
    }

    @Override
    public CopyObject createCopy()
    {
        return new Cellphone(type);
    }

    @Override
    public String toString()
    {
        return "this is a : " + type;
    }
}
