/**
 * Write a description of class MediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main()
    {
        Song song1 = new Song();
        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");  
     System.out.println(song1.getTitle());
     System.out.println(song1.getRating());
    }
}
