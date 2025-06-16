/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Car {

    private CarType carType;
    private ColorType colorType;
    private PriceCar price;
    private Days daySellCar;

    public Car(CarType carType, ColorType colorType, PriceCar price, Days daySellCar) {
        this.carType = carType;
        this.colorType = colorType;
        this.price = price;
        this.daySellCar = daySellCar;
    }

    public CarType getCarType() {
        return carType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public PriceCar getPrice() {
        return price;
    }

    public Days getDaySellCar() {
        return daySellCar;
    }

    @Override
    public String toString() {
        String out = ""/*= String.format(format, args)*/;
        return out;
    }

}
