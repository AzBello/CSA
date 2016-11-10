
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(String[] args)
    {
       String weatherCondtion =  "sleet";
       System.out.println(weatherCondtion.length());
       System.out.println(weatherCondtion.substring(0,5));
       System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
    }
}