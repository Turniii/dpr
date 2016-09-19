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
public class SnowTires extends Accessories
{
    private int snowTiresPrice = 550;
    public SnowTires(Car carModel) 
    {
        super(carModel);
    }
    
    @Override
    public int getPrice() 
    {
        return car.getPrice() + snowTiresPrice;
    }

    @Override
    public String getDescription() 
    {
        return car.getDescription() + "Show Tires: $"+ snowTiresPrice+"\n";
    }
    
     @Override
    public String getCarName() 
    {
        return car.getCarName();
    }
    
    
}
