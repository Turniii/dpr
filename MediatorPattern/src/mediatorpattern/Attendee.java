/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

/**
 *
 * @author Turni
 */
public class Attendee extends PresentationMember{
    
    public Attendee(Mediator mediat) {
        super(mediat);
    }
    
     public void askQuestion(String question)
    {
        
        mediator.sendQuestion(question, this);
    }
 
    public void receiveImage(String url)
    {
        
    }
    
    public String getPresenterName(){
        return super.mediator.presenter.getName();
    }

}
