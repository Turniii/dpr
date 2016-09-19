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
public class VolkswagenBeetle implements Car
{

    @Override
    public int getPrice() 
    {
       return 19795;
    }

    @Override
    public String getDescription() {
        return "Car Accessories: \n";
    }

    @Override
    public String getCarName() 
    {
        return "Volkswagen Beetle";
    }
    
}
