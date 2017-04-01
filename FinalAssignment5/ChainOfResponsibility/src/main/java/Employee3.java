/**
 * Created by qaasiem on 2017-04-01.
 */
public class Employee3 extends Manager
{
    @Override
    public String managerRating(int rating) {
        if(rating > 3 && rating < 5){
            return "3% bonus";
        }else{
            return score.managerRating(rating);
        }
    }
}
