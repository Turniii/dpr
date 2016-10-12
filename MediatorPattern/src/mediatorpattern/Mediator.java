/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.util.ArrayList;
import java.util.List;
import mediatorpattern.frames.PresenterFrame;
import mediatorpattern.frames.attendeeFrame;

/**
 *
 * @author Turni
 */
public class Mediator {
    
    public Presenter presenter;
    public List<Attendee> attendees;
    
     private PresenterFrame pFrame;
    private attendeeFrame aFrame;
    
    
    public Mediator (Presenter presenter){
        this.presenter = presenter;
        this.attendees = new ArrayList<>();
    }
    
    /*public void addAttendee(Attendee newAttendee){
        attendees.add(newAttendee);
    }*/
    
    public void sendAnswer( String answer,Attendee attendee,PresenterFrame pFrame){
       attendee.receiveAnswer(answer, pFrame);
    }
    
    public void sendQuestion(String question, Attendee attendee, attendeeFrame aframe, PresenterFrame pFrame){
        this.pFrame = pFrame;
        this.aFrame = aframe;
        presenter.receiveQuestion(question, attendee, aFrame,  this.pFrame);
    }
    
    public List<Attendee> getattendees()
    {
     return pFrame.attendees;
    }
    
     public void setattendees(ArrayList<Attendee> attendees)
    {
     this.attendees = attendees;
    }
    
    
}
