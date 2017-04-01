/**
 * Created by qaasiem on 2017-04-01.
 */
public class Blazer implements ClothingShop
{
    @Override
    public void welcome(Client c) {
        c.visit(this);
    }
}
