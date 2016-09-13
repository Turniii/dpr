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
    String weather, temperature;
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
         temperature = currentWeather.get("Temperature");
         float temp = convertTempToFahrenheit(Float.parseFloat(temperature));
        System.out.println("F: weather update; current Tempreature: " + temp + " weather : "+weather);
    }
   public float convertTempToFahrenheit(float temp)
   {
        float fahrenheit =  (float) (temp * 1.8 + 32) ;
        return fahrenheit;
   }

}

