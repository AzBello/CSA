
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
        int index = songInfo.indexOf("|");
        while (index > 0)
        {
            System.out.println("Title:" + songInfo.substring(0,index));
            songInfo = songInfo.substring(index + 1);
            index = songInfo.indexOf("|");
            System.out.println("Rating:" + songInfo.substring(0,index));
            songInfo = songInfo.substring(index +1);
            index = songInfo.indexOf("|");
        }
    }
}