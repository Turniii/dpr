/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.util.HashMap;

/**
 *
 * @author Turni
 */
public class FarenheitObserver extends Observer {
    Subject subject;
    String weather, dayTime, temperature;
    HashMap<String, String> currentWeather;
    
    public FarenheitObserver(Subject s)
    {
        this.subject = s;
        s.attach(this);
    }
    
    @Override
    public void update()
    {
         currentWeather = subject.getWeather();
         weather = currentWeather.get("WeatherText");
         dayTime = currentWeather.get("isDayTime");
         temperature = currentWeather.get("Temperature");
         int temp = convertTempToFahrenheit(Integer.getInteger(temperature));
        System.out.println("weather update; current Tempreature: " + temp + " Time of " + dayTime+ " weather : "+weather);
    }
   public int convertTempToFahrenheit(int temp)
   {
        int fahrenheit =  (int) (temp * 1.8 + 32) ;
        return fahrenheit;
   }

}

