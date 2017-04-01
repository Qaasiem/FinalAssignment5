/**
 * Created by qaasiem on 2017-04-01.
 */
public class ClothingShopVisiterView implements Client
{
    @Override
    public void visit(Suit suit) {
        System.out.println("Fitting on suit");
    }

    @Override
    public void visit(Shirt shirt) {
        System.out.println("Fitting on shirt");
    }

    @Override
    public void visit(Pants pants) {
        System.out.println("Fitting on pants");
    }

    @Override
    public void visit(Blazer blazer) {
        System.out.println("Fitting on blazer");
    }
}
