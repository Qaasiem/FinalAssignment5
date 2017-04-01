/**
 * Created by qaasiem on 2017-04-01.
 */
public class Employee2 extends Manager
{
    @Override
    public String managerRating(int rating) {
        if(rating > 5 && rating < 8){
            return "5% bonus";
        }else{
            return score.managerRating(rating);
        }
    }
}
