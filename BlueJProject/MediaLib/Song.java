
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
   
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String movie;
    private String book;
    private double price;
    private boolean favorite;
    private int duration;
  
    
    
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
    public String getMovie() {
        return movie;
    }
    public void setMovie(String m) {
        movie = m;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String b) {
        book = b;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public void addToFavorites() {
        favorite = true;
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    
   public int getDuration() {
        return duration;
    }
    public void setDuration(int d) {
        duration = d;
    }
    
    
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        movie = "";
        book = "";
        price = 0.0;
        duration = 0;
    }
    
}
