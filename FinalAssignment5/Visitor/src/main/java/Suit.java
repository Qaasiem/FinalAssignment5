import com.sun.deploy.util.SessionState;

import java.sql.ClientInfoStatus;

/**
 * Created by qaasiem on 2017-04-01.
 */
public class Suit implements ClothingShop
{
    ClothingShop[] clothing;

    public Suit(){
        clothing = new ClothingShop[] {new Blazer(), new Pants(), new Shirt()};
    }


    @Override
    public void welcome(Client c) {
        for (int z = 0; z < clothing.length; z++) {
            clothing[z].welcome(c);
        }
        c.visit(this);
    }
}
