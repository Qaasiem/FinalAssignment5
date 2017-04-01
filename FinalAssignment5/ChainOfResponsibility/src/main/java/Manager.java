/**
 * Created by qaasiem on 2017-04-01.
 */
public abstract class Manager
{
    Manager score;
    public void setScore(Manager score) {
        this.score = score;
    }
    public abstract String managerRating (int rating);
}
