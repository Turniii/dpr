/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import java.util.List;
import mediatorpattern.frames.PresenterFrame;
import mediatorpattern.frames.attendeeFrame;

/**
 *
 * @author Turni
 */
public class Presenter extends PresentationMember{
    private PresenterFrame pFrame;
    private attendeeFrame aFrame;

    public Presenter(Mediator mediat, String name) {
        super(mediat);
        super.setName(name);
    }
    
    public String answerQuestion(String answer, Attendee attendee,Mediator mediator, PresenterFrame pFrame){
       //this.aFrame.setArea("Presenter answered your question: "+ answer);
       mediator.sendAnswer(answer,attendee,pFrame);
       return "Presenter answered your question: "+ answer;
    }
    
    public void receiveQuestion(String question, Attendee attendee, attendeeFrame aFrame, PresenterFrame pFrame){
       
        this.pFrame = pFrame;
        this.aFrame = aFrame;
        this.pFrame.setTextArea("Attendee: "+ attendee.getName()+", asked the following: "+question);
    }
}
