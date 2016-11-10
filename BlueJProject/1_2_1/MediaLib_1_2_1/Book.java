
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private String book;
    private int rating;
    private String title;
    public String getBook() {
        return book;
    }
    public void setBook(String b) {
        book = b;
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
    public Book()
    {
       book = "";
       rating = 0;
       title = "";
    }
   
        
}