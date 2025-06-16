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

    public List<String> getValueIndex(CarType carType) {
        List<String> getDayStrings = new ArrayList<>();
        if (getCarType().equals(carType)) {
            for (int i = 0; i < daySellCars.length; i++) {
                for (Days day : Days.values()) {
                    if (daySellCars[i] == day.getTypeSelectionNumber()) {
                        getDayStrings.add(day.getTypeValueString());
                        break;
                    }
                }
            }
        }
        return getDayStrings;
    }

}
