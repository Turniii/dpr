/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import javax.swing.JTextArea;

/**
 *
 * @author Turni
 */
public abstract  class PresentationMember {
    protected Mediator mediator;
    public String name;
    public JTextArea textArea;
    
    public PresentationMember(Mediator mediat){
        mediator = mediat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void receiveAnswer(String answer){
        this.textArea.append(mediator.presenter.getName()+ " answered your question : "+ answer);
    }
    public Mediator getMediator(){
        return this.mediator;
    }
    
    public void setTextArea(JTextArea textArea){
        this.textArea = textArea;
    }
    
}
