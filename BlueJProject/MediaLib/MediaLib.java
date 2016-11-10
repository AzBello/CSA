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
        double totalCost = 0.0;       
        int numSongs = 0;
        int totalRatings = 0;
        double averageCost = 0.0;
        double averageRating = 0.0;
        
        
        Song song1 = new Song();    
        
        Song song2 = new Song();
        
        Song song3 = new Song();
        
        Song song4 = new Song();
        
        Song song5 = new Song();
        
        Song song6 = new Song();
        
        Song song7 = new Song();
        Movie movie1 = new Movie();
        Book book1= new Book();
        System.out.println("Welcome to your Media Library");
        
        song1.setTitle("Johnny B. Goode");
        song1.setRating(10);
        movie1.setTitle("The Movie");
        book1.setTitle("The Book");
        song1.setPrice(3.99);
       
        song2.setTitle("something");
        song2.setRating(8);
        song2.setPrice(1.29);
        
        
        
        song3.setTitle("some");
        song3.setRating(4);
        song3.setPrice(.99);
        
      
        
        song4.setTitle("so");
        song4.setRating(9);
        song4.setPrice(1.29);
        
       
        
        song5.setTitle("thing");
        song5.setRating(2);
        song5.setPrice(.99);
        
        
        
        song6.setTitle("me");
        song6.setRating(5);
        song6.setPrice(.99);
        
        
        
        song7.setTitle("idk");
        song7.setRating(10);
        song7.setPrice(1.29);
        
      
        
     System.out.println(song1.getTitle());
     System.out.println(song1.getRating());     
     System.out.println(movie1.getTitle());    
     System.out.println(book1.getTitle());
     System.out.println(song1.getPrice());
     
     
     System.out.println(song2.getTitle());
     System.out.println(song2.getRating());
     System.out.println(song2.getPrice());
    
     
     System.out.println(song3.getTitle());
     System.out.println(song3.getRating());
     System.out.println(song3.getPrice());
     
     
     System.out.println(song4.getTitle());
     System.out.println(song4.getRating());
     System.out.println(song4.getPrice());
    
     
     System.out.println(song5.getTitle());
     System.out.println(song5.getRating());
     System.out.println(song5.getPrice());    
     
     
     System.out.println(song6.getTitle());
     System.out.println(song6.getRating());
     System.out.println(song6.getPrice());
     
     
     System.out.println(song7.getTitle());
     System.out.println(song7.getRating());
     System.out.println(song7.getPrice());
     
     
     totalCost += song1.getPrice();
     totalCost += song2.getPrice();
     totalCost += song3.getPrice();
     totalCost += song4.getPrice();
     totalCost += song5.getPrice();
     totalCost += song6.getPrice();
     totalCost += song7.getPrice();
     System.out.println("Total Cost");
     System.out.println(totalCost);
     System.out.println( );
     
     numSongs += 1;
     numSongs += 1;
     numSongs += 1;
     numSongs += 1;
     numSongs += 1;
     numSongs += 1;
     numSongs += 1;
     System.out.println("Number of Songs");
     System.out.println(numSongs);
     System.out.println( );
     
     totalRatings += song1.getRating();
     totalRatings += song2.getRating();
     totalRatings += song3.getRating();
     totalRatings += song4.getRating();
     totalRatings += song5.getRating();
     totalRatings += song6.getRating();
     totalRatings += song7.getRating();
     System.out.println("Total Ratings");
     System.out.println(totalRatings);
     System.out.println( );
     
     averageCost = (totalCost / numSongs);
     System.out.println("Average Cost");
     System.out.println(averageCost);
     System.out.println( );
     System.out.println("Total Cost");
     System.out.println(totalCost);
     System.out.println( );
     
     //testing a calculation:
     double testVal = 109.41;
     double testResult = testVal / 10;
     System.out.println("Testing Result:");
     System.out.println(testResult);
     System.out.println( );
     
     averageRating = (totalRatings / numSongs);
     System.out.println("Average Rating");
     System.out.println(averageRating);
     
     movie1.setDuration(97);
     System.out.println("Movie Duration");
     System.out.println(movie1.getDuration()/60 + ":" + movie1.getDuration()%60);                     
     System.out.println( );     
     
     MediaFile.writeString(song1.getTitle() +"|"+ song1.getRating());
     
     MediaFile.writeString(song2.getTitle() +"|"+ song2.getRating());
     
     MediaFile.writeString(song3.getTitle() +"|"+ song3.getRating());
     
     MediaFile.writeString(song4.getTitle() +"|"+ song4.getRating());
     
     MediaFile.writeString(song5.getTitle() +"|"+ song5.getRating());
     
     MediaFile.writeString(song6.getTitle() +"|"+ song6.getRating());
     
     MediaFile.writeString(song7.getTitle() +"|"+ song7.getRating());
     MediaFile.saveAndClose();
     
     
    }
}
