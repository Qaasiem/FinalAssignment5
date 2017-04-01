/**
 * Created by qaasiem on 2017-03-31.
 */
public class Samsung implements CopyObject
{
    private String model;
    public Samsung(String model)
    {
        this.model = model;
    }
    @Override
    public CopyObject createCopy()
    {
        return new Samsung(model);
    }

    @Override
    public String toString()
    {
        return "this is a : " + model;
    }
}
