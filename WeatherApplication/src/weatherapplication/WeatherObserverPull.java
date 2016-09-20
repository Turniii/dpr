/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.util.HashMap;
import javax.swing.JTextArea;

/**
 *
 * @author Turni
 */
public class WeatherObserverPull extends Observer {
    
    
    Subject subject;
    String weather, dayTime, temperature;
    HashMap<String, String> currentWeather;
    JTextArea textArea;
    
    public WeatherObserverPull(Subject s, JTextArea textAre)
    {
        this.subject = s;
        s.attach(this);
        textArea =  textAre;
    }
    
    @Override
    public void update()
    {
         currentWeather = subject.getWeather();
         weather = currentWeather.get("WeatherText");
         dayTime = currentWeather.get("isDayTime");
         temperature = currentWeather.get("Temperature");
        textArea.setText("weather update; current Tempreature: " + temperature +  " weather : "+weather);
    }
    
}

