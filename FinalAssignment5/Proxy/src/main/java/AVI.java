/**
 * Created by qaasiem on 2017-04-01.
 */
public class AVI implements Movie
{
    private HD hd;
    private String movieTitle;

    public AVI(String movieTitle){
        this.movieTitle = movieTitle;
    }

    @Override
    public String view() {
        if(hd == null){
            hd = new HD(movieTitle);
        }
        hd.view();
        return movieTitle;
    }
}
