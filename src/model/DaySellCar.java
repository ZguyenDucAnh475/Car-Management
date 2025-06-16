/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenDucAnh
 */
public enum DaySellCar {
    AUDI_DAYSELL(new int[]{1, 5, 7}, CarType.AUDI),
    MERCEDES_DAYSELL(new int[]{2, 3, 6}, CarType.MERCEDES),
    BMW_DAYSELL(new int[]{1, 4, 7}, CarType.BMW);

    private int[] daySellCars;
    private CarType carType;

    DaySellCar() {
    }

    private DaySellCar(int[] daySellCars, CarType carType) {
        this.daySellCars = daySellCars;
        this.carType = carType;
    }

    public int[] getDaySellCars() {
        return daySellCars;
    }

    public CarType getCarType() {
        return carType;
    }


    
}
