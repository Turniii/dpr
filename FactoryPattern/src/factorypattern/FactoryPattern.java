/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import factorypattern.Factories.MinionFactory;

/**
 *
 * @author Turni
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MinionFactory mFactory = new MinionFactory();
        GenericGame mGame = new GenericGame();
        mGame.run(mFactory);
    }
    
}
