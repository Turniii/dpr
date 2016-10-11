/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Turni
 */
public class Mediator {
    
    public Presenter presenter;
    public List<Attendee> attendees;
    
    public void updateImage(String url){
        for (Attendee attendee : attendees){
            
        }
    }
    
    public Mediator (Presenter presenter){
        this.presenter = presenter;
        this.attendees = new ArrayList<Attendee>();
    }
    
    public void addAttendee(Attendee newAttendee){
        attendees.add(newAttendee);
    }
    
    public void sendAnswer(String answer, Attendee attendee){
        attendee.receiveAnswer(answer);
    }
    
    public void sendQuestion(String question, Attendee attendee){
        
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }
    
    
    
}
