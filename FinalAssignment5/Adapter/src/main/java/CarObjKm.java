/**
 * Created by qaasiem on 2017-03-31.
 */
public class CarObjKm implements CarEngine
{
    private Car1 c = new Car1();

    @Override
    public MaxSpeed getKm()
    {
        return c.getMaxSpeed();
    }

    @Override
    public MaxSpeed getKmToMiles() {
        MaxSpeed m = c.getMaxSpeed();
        return calcKM(m,80);
    }

    @Override
    public MaxSpeed getKmToMeters() {
        MaxSpeed m = c.getMaxSpeed();
        return calcKM(m,180);
    }

    private MaxSpeed calcKM(MaxSpeed m, int con)
    {
        return new MaxSpeed(m.getkm()/con);
    }
}
