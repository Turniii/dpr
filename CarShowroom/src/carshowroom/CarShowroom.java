/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carshowroom;

/**
 *
 * @author adhraa
 */
public class CarShowroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Car ford = new FordTaunus();
        ford = new AirConditioner(ford);
        ford = new Bullbar(ford);
        
        System.out.println("Car chosen: " + ford.getCarName()+"\n");
        System.out.println(ford.getDescription());   
        System.out.println("Car total price: " + ford.getPrice()); 
        
        
       
        
    }
    
}
