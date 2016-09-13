package weatherapplication;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adhraa
 */
public class WeatherObserver extends Observer{
    
    Subject subject;
    String weather, temperature;
    HashMap<String, String> currentWeather;
    
    public WeatherObserver(Subject s)
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
        System.out.println("weather update; current Tempreature: " + temperature + " weather : "+weather);
    }
    
}
