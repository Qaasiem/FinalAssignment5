/**
 * Created by qaasiem on 2017-04-01.
 */
public class Carnivore implements Zoo
{
    @Override
    public Animal getAnimalName(String location)
    {
        if(location == "siteA")
        {
            return new Lion();
        }
        else if (location == "siteC")
        {
            return new Bear();
        }
        return null;
    }
}
