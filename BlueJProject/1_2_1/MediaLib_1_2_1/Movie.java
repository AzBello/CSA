
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    public String movie;
    private String title;
    private int rating;
    private int duration;
    
    
    public String getMovie() {
        return movie;
    }
    public void setMovie(String m) {
        movie = m;
    }
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int d) {
        duration = d;
    }
    
    public Movie()
    {
        movie = "";
        rating = 0;
        title = "";
        duration = 0;
    }
}