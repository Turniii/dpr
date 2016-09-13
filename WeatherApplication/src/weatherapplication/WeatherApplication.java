/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;




/**
 *
 * @author adhraa
 */
public class WeatherApplication {
        public static Subject subject;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("weatherapplication.WeatherApplication.main()");
        
        //Setting observers and subject
        subject = new Subject();
        WeatherObserver oberver = new WeatherObserver(subject);
        
        
        Timer timer = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                subject.setWeather();
            }
        });
    }
    
}
