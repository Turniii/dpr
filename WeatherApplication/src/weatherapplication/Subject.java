/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adhraa
 */
public class Subject implements ISubject
{
    List<Observer> obervers = new ArrayList<>();
    private HashMap<String, String> currentWeather;
   
   public Subject(){
       
   }
    
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
    public HashMap<String, String>  getWeather()
    {
        return currentWeather;
    }
     
    @Override
    public void setWeather()
    {
        try {
            currentWeather = HttpConnection.getData();
        } catch (Exception ex) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, ex);
        }
        notifyObervers();
    }
    
    @Override
   public void notifyObervers()
   {
       obervers.stream().forEach((oberver) -> {
           oberver.update();
        });
 
   }
}
