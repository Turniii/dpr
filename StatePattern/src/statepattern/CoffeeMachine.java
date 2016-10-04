/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

import statepattern.states.DispensingState;
import statepattern.states.EmptyState;
import statepattern.states.IState;
import statepattern.states.MoneyState;
import statepattern.states.NoMoneyState;

/**
 *
 * @author Turni
 */
public class CoffeeMachine {
    IState dispensingState = new DispensingState(this);
    IState emptyState = new EmptyState(this);
    IState moneyState =new MoneyState(this);
    IState noMoneyState = new NoMoneyState(this);
    IState currentState = null;
    int capacity = 0;
    
    public CoffeeMachine() {
        setCurrentState(emptyState);
    }

    public IState getCurrentState() {
        return currentState;
    }
    
    public IState getState(String state){
        switch(state){
            case "empty":
                return emptyState;
            case "money":
                return moneyState;
            case "noMoney":
                return noMoneyState;
            case "dispensingState":
                return dispensingState;
            default:
                return null;
        }
    }
    
    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
    public void orderCoffee(){
        this.currentState.orderCoffee();
        if (this.currentState == dispensingState){
            this.currentState.makeCoffee();
        }
    }
    
    public void refill(){
        this.currentState.refill();
    }
    
    public void addMoney(){
        this.currentState.addMoney();
    }
    
    
}
