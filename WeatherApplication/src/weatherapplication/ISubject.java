package weatherapplication;

import java.util.ArrayList;
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
public interface ISubject 
{
       public ArrayList<Observer> observers = new ArrayList<>();
       public void attach(Observer o);
       public void detach(Observer o);
       public HashMap<String, String>  getWeather();
       public void setWeather();
       public void notifyObervers();
}
