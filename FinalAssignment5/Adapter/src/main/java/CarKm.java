/**
 * Created by qaasiem on 2017-03-31.
 */
public class CarKm extends Car1 implements CarEngine
{
    @Override
    public MaxSpeed getKm() {
        return getMaxSpeed();
    }
    @Override
    public MaxSpeed getKmToMiles() {
        MaxSpeed m = getMaxSpeed();
        return calcKM(m,2);
    }
    @Override
    public MaxSpeed getKmToMeters() {
        MaxSpeed m = getMaxSpeed();
        return calcKM(m,10);
    }

    private MaxSpeed calcKM(MaxSpeed m, int con)
    {
        return new MaxSpeed(m.getkm()/con);
    }
}
