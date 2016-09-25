/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import factorypattern.StdDraw;
import factorypattern.items.IFigure;

/**
 *
 * @author Turni
 */
public class Board {
   private IFigure figure;
   public Board (IFactory factory){
       StdDraw.setCanvasSize(600, 400);
       StdDraw.setXscale(0, 600);
       StdDraw.setYscale(0, 400);
       StdDraw.picture(300, 200, "img/minionBack.jpg");
       StdDraw.setPenRadius(0.05);
       StdDraw.setPenColor(167,125,87);
       StdDraw.line(0, 0, 600, 0);
       StdDraw.picture(525, 75, "img/minionHouse.png");
       StdDraw.picture(60,80,"img/minionSprite.png");
       StdDraw.picture(90,80, "img/minionGadget.png");
   }
    
    
}

