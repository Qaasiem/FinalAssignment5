/**
 * Created by qaasiem on 2017-04-01.
 */
public class Herbivores implements Zoo
{
    @Override
    public Animal getAnimalName(String location)
    {
        if(location == "siteB")
        {
            return new Elephant();
        }
        else if (location == "siteD")
        {
            return new Buffalo();
        }
        return null;
    }
}
