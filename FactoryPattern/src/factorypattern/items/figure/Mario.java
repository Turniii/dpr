/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.items.figure;

import factorypattern.items.IFigure;
import java.awt.Image;

/**
 *
 * @author Turni
 */
public class Mario implements IFigure{

    @Override
    public void jump() {
          System.out.println("Mario jump."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveForward() {
         System.out.println("Mario MF."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveBackward() {
          System.out.println("Mario MB."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image draw() {
          System.out.println("Mario draw.");
          return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}
