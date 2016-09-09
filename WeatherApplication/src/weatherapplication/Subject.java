/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adhraa
 */
public class Subject implements ISubject
{
    List<Observer> obervers = new ArrayList<>();
    private int temperature;
    private String currentMode;
    
   public enum tempMode { celsius, fahrenheit }
   
    
    @Override
    public void attach(Observer o)
    {
        obervers.add(o);
    }
    
    @Override
    public void detach(Observer o)
    {
        obervers.remove(o);
    }
    
    @Override
    public int getWeather()
    {
        return temperature;
    }
     
    @Override
    public void setWeather(int currentTemp)
    {
        temperature = currentTemp;
        notifyObervers();
    }
    
    @Override
   public void notifyObervers()
   {
       obervers.stream().forEach((oberver) -> {
           oberver.update();
        });
 
   }
   
    @Override
   public void setCurrentTempMode(String mode){
      currentMode = mode;
   }
    @Override
   public String getCurrentTempMode(){
       return  currentMode;
   }
   
    @Override
   public int convertTempToFahrenheit(int temp)
   {
       int fahrenheit =  (int) (temp * 1.8 + 32) ;
       return fahrenheit;
   }
   
    @Override
   public int convertTempToCelsius(int temp)
   {
       int celsius =  (int) ((temp- 32) * 0.5556);
       return celsius;
   }
    
}
