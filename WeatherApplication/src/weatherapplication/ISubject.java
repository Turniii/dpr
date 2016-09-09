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
public interface ISubject 
{
       public void attach(Observer o);
       public void detach(Observer o);
       public int getWeather();
       public void setWeather(int temp);
       public void notifyObervers();
       public void setCurrentTempMode(String mode);
       public String getCurrentTempMode();
       public int convertTempToCelsius(int temp);
       public int convertTempToFahrenheit(int temp);

    
}
