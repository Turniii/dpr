/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.Factories;

import factorypattern.IFactory;
import factorypattern.items.IFigure;
import factorypattern.items.figure.Minion;

/**
 *
 * @author Turni
 */
public class MinionFactory implements IFactory{

    @Override
    public IFigure createFigure() {
        return new Minion();
    }

    @Override
    public String getName() {
        return "Minion Game";
    }
    
    
    
}
