/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import mediatorpattern.frames.PresenterFrame;
import mediatorpattern.frames.attendeeFrame;

/**
 *
 * @author Turni
 */

public class Attendee extends PresentationMember{
    
   private PresenterFrame pFrame;
    private attendeeFrame aFrame;
    public Attendee(Mediator mediat) {
        super(mediat);
    }
    
     public void askQuestion(String question, attendeeFrame aFrame, PresenterFrame pFrame)
    {      
        this.pFrame = pFrame;
        this.aFrame = aFrame;
        aFrame.setArea("You've asked the following question to "+question);
        mediator.sendQuestion(question,this, this.aFrame,this.pFrame);
    }
 
}
