
/**
 * Write a description of class FavoritesMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
       String songInfo = MediaFile.readString();
         int index = songInfo.indexOf("|");
         while (index > 0)
         {
             System.out.print( songInfo.substring(0,index));
            songInfo = songInfo.substring(index + 1);
             index = songInfo.indexOf("|");
             System.out.println("(" + songInfo.substring(0,index) + " )");
           songInfo = songInfo.substring(index +1);
            index = songInfo.indexOf("|");
         } 
       
       //for (int i = 0; i < 100; i++)
        //{
          //System.out.print(songInfo);
          
    }
        
    }
