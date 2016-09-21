/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.items.figure;

import factorypattern.items.IFigure;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Turni
 */
public class Minion implements IFigure {

    @Override
    public void jump() {
        System.out.println("Minion jump."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveForward() {
        System.out.println("Minion MF."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveBackward() {
        System.out.println("Minion MB."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image draw() {
        ImageIcon ii = new ImageIcon("minionSprite");
        return ii.getImage();//To change body of generated methods, choose Tools | Templates.
    }
    
}
