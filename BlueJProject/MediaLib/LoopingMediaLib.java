
/**
 * Write a description of class LoopingMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
        
        String songInfo = MediaFile.readString();
        
        for (int i= 0; i <7; i++)
        {
            System.out.println(songInfo);
        }
        
        while (songInfo != null)
        {            
           int index = songInfo.indexOf("|");
        }
        
    }

}