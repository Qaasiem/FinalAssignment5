import com.sun.deploy.util.SessionState;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class Shirt implements ClothingShop
{
    @Override
    public void welcome(Client c) {
        c.visit(this);
    }
}
