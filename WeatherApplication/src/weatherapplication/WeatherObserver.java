package weatherapplication;

import java.util.HashMap;
import javax.swing.JTextArea;

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
    String weather, dayTime, temperature;
    HashMap<String, String> currentWeather;
    JTextArea textArea;
    
    public WeatherObserver(Subject s,JTextArea jTextArea1)
    {
        this.subject = s;
        s.attach(this);
        textArea = jTextArea1;
    }

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
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
