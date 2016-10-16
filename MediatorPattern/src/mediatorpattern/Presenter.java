/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.util.List;
import mediatorpattern.frames.PresenterFrame;
import mediatorpattern.frames.AttendeeFrame;

/**
 *
 * @author Turni
 */
public class Presenter extends PresentationMember{
   

    public Presenter(Mediator mediat, String name) {
        super(mediat);
        super.setName(name);
    }
    
    public String answerQuestion(String answer, Attendee attendee,Mediator mediator, AttendeeFrame aFrame){
       //this.aFrame.setArea("Presenter answered your question: "+ answer);
       mediator.sendAnswer(answer,attendee, aFrame);
       return "You've answered "+ attendee.name +"'s quetion : "+ answer;
    }
    
    public void receiveQuestion(String question, Attendee attendee, PresenterFrame pFrame){
        pFrame.setTextArea("Attendee: "+ attendee.getName()+", asked the following: "+question);
    }
    
    public void sendSlide(String image,AttendeeFrame attendeeFrame,String slide, Mediator mediator){
        mediator.sendImage(image, attendeeFrame, slide);
    }
}
