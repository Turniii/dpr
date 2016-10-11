/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.util.List;

/**
 *
 * @author Turni
 */
public class Presenter extends PresentationMember{
    
    public Presenter(Mediator mediat, String name) {
        super(mediat);
        super.setName(name);
    }
    
    public void answerQuestion(String answer, Attendee attendee){
        attendee.receiveAnswer(answer);
    }
    
    public void receiveQuestion(String question, Attendee attendee){
        
    }
    
    public void sendNewImage(String url){
        
    }
    
    public List<Attendee> getAttendees(){
        return super.mediator.attendees;
    }
}
