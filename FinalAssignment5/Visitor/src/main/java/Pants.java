/**
 * Created by qaasiem on 2017-04-01.
 */
public class Pants implements ClothingShop
{
    @Override
    public void welcome(Client c) {
        c.visit(this);
    }
}
