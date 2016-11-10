
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib

{
    public static void main()
    {
    String[] sharingFriends = {"person1",
     "person2",
     "person3",
     "person4",
     "person5",
    };
    
    for (int i = 0; i < 5; i++)
    {
        System.out.println(sharingFriends[i]);
    }
    
    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3,};
    int total = 0;
    for (int days: daysBtwnPurchase)
    {
        total += days;
    }
    System.out.println(total/daysBtwnPurchase.length);
    
    Song[] topTenSongs = {new Song("The Twist"), new Song("Smooth"), new Song("Mack the Knife"),
        new Song("How do I Live"), new Song("Party Rock Anthem"), new Song ("I Gotta Feeling"),
        new Song("Macarena (Bayside Boys MIX)"), new Song("Physical"), new Song("You Light Up My Life"),
        new Song("Hey Jude")    
    };
    
    
    
    for (Song s: topTenSongs)
    {
        
        System.out.println(s.getTitle());
    }
    
    // change the array
    //System.out.println("-BEFORE--");
    for (Song changeSong : topTenSongs) {
        changeSong.setPrice(1.29);
        
        System.out.println(changeSong.getPrice());
    }
    
    //}
    // show the array
    //System.out.println("--AFTER--");
    //for (Song showSong : topTenSongs) {
        //System.out.println(showSong.getTitle());
    //}
   }
}
