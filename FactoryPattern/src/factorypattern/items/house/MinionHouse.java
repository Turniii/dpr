/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.items.house;

import factorypattern.StdDraw;
import factorypattern.items.IHouse;
import java.awt.Image;

/**
 *
 * @author Turni
 */
public class MinionHouse implements IHouse{

    @Override
    public void draw() {
           StdDraw.picture(525, 75, "img/minionHouse.png");
    }
    
}
