package weatherapplication;

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
    
    public WeatherObserver(Subject s)
    {
        this.subject = s;
        s.attach(this);
    }
    
    @Override
    public void update()
    {
        int currentTemp = subject.getWeather();
       
        System.out.println("weather update; current Tempreature: " + currentTemp + " " + subject.getCurrentTempMode());
    }
    
}
