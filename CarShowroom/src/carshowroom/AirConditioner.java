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
public class AirConditioner extends Accessories
{
    private int airconPrice = 450;
    public AirConditioner(Car carModel) 
    {
        super(carModel);
    }
    
    @Override
    public int getPrice() 
    {
        return car.getPrice() + airconPrice;
    }

    @Override
    public String getDescription() 
    {
        return car.getDescription() + "Air Conditioner: $"+ airconPrice+"\n";
    }

    @Override
    public String getCarName() 
    {
        return car.getCarName();
    }
    
}
