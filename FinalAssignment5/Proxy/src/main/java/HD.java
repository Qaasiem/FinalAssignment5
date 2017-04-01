/**
 * Created by qaasiem on 2017-04-01.
 */
public class HD implements Movie
{
    private String movieTitle;

    public HD(String movieTitle){
        this.movieTitle = movieTitle;
        bufferMovie(movieTitle);
    }

    @Override
    public String view() {
        System.out.println("view " + movieTitle);
        return movieTitle;
    }

    private void bufferMovie(String movieTitle){
        System.out.println("Standby " + movieTitle);
    }
}
