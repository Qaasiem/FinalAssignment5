/**
 * Created by qaasiem on 2017-04-01.
 */
public class Employee1 extends Manager
{
    @Override
    public String managerRating(int rating) {
        if(rating > 7 && rating < 11){
            return "8% bonus";
        }else{
            return score.managerRating(rating);
        }
    }
}
