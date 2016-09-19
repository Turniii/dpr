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
public abstract class Accessories implements Car
{
    protected Car car;
    
    public Accessories(Car carModel)
    {
        this.car = carModel;
    }
    
    @Override
    public int getPrice() {
        return car.getPrice();
    }

    @Override
    public String getDescription() 
    {
        return car.getDescription();
    }
     
}
