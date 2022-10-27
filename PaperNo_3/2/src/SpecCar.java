/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SpecCar extends Car {

    int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return getMaker() + "," + getPrice() + "," + type;
    }
    
    public void setData() {
        setMaker("XZ" + getMaker());
        setPrice(getPrice() + 20);
    }
    
    public int getValue() {
        if (type < 7) {
            return getPrice() + 10;
        }
        return getPrice() + 15;
    }
    
}
