
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherConditionals

{

    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        boolean snow = true;
        if (description.equals("snow"));
            snow = true;                      
        if (description.equals("windy"));
        windy = true;
        if (snow && temperature > 100);
            System.out.println("It can't be 100 degrees and snowing");
        if (windy && temperature < 31);
        return "Too windy or cold! Enjoy watching through the window";                              
    }
    
    

}