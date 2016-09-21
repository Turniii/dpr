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
public class FarenheitObserver extends Observer {
    Subject subject;
    String weather, temperature;
    HashMap<String, String> currentWeather;
    JTextArea textArea;
    public FarenheitObserver(Subject s, JTextArea textAre)
    {
        this.subject = s;
        s.attach(this);
        textArea = textAre;
    }
    
    @Override
    public void update()
    {
         currentWeather = subject.getWeather();
         weather = currentWeather.get("WeatherText");
         temperature = currentWeather.get("Temperature");
         float temp = convertTempToFahrenheit(Float.parseFloat(temperature));
<<<<<<< HEAD
        textArea.setText("weather update; current Tempreature: " + temperature + " weather : "+weather);
=======
        System.out.println("F: weather update; current Tempreature: " + temp + " weather : "+weather);
>>>>>>> origin/master
    }
   public float convertTempToFahrenheit(float temp)
   {
        float fahrenheit =  (float) (temp * 1.8 + 32) ;
        return fahrenheit;
   }

    public FarenheitObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

}

