/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherapplication;




/**
 *
 * @author adhraa
 */
public class WeatherApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        System.out.println("weatherapplication.WeatherApplication.main()");
        
        Subject subject = new Subject();
        WeatherObserver oberver = new WeatherObserver(subject);

        subject.setCurrentTempMode(Subject.tempMode.celsius.name());
        subject.setWeather(15);
        
       System.out.println("weather in fahrenheit " + subject.convertTempToFahrenheit(subject.getWeather()));
       System.out.println("weather in Celsius " + subject.convertTempToCelsius(59));


        HttpConnection httpConnection = new HttpConnection();
        System.out.println(httpConnection.getData());
        
    }
    
}
