/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import factorypattern.items.IFigure;

/**
 *
 * @author Turni
 */
public class GenericGame {
    public void run(IFactory f){
        IFigure figure = f.createFigure();
        figure.jump();
        figure.draw();
    }
}
