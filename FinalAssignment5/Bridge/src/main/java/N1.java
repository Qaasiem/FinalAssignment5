/**
 * Created by qaasiem on 2017-03-31.
 */
public class N1 implements Map
{
    @Override
    public void mapView(int distance, int freewayLength, int freewayWidth)
    {
        System.out.println("The distance from mall A to mall B on N1 is: " + distance + "km. The total length of this freeway is :" + freewayLength + "km and the average width is: " + freewayWidth + "m.");
    }
}
