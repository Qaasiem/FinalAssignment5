/**
 * Created by qaasiem on 2017-03-31.
 */
public class M5 extends Freeway
{
    private int distance, freewayLength, freewayWidth;

    public M5(int freewayLength, int freewayWidth, int distance, Map m) {
        super(m);
        this.freewayLength = freewayLength;
        this.freewayWidth = freewayWidth;
        this.distance = distance;
    }

    public void view() {
        m.mapView(distance, freewayLength, freewayWidth);
    }
}
