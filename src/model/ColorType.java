/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum ColorType {
    WHITE(CarType.AUDI, 1, "white"),
    YELLOW(CarType.AUDI, 2, "yellow"),
    ORANGE(CarType.AUDI, 3, "orange"),
    GREEN(CarType.MERCEDES, 1, "green"),
    BLUE(CarType.MERCEDES, 2, "blue"),
    PURPLE(CarType.MERCEDES, 3, "purple"),
    PINK(CarType.BMW, 1, "pink"),
    RED(CarType.BMW, 2, "red"),
    BROWN(CarType.BMW, 3, "brown"),
    NO_COLOR(null,4,"no color");
    
    private CarType typeColorOfEachCar;
    private int typeSelectionNumber;
    private String typeValueString;

    private ColorType(CarType typeColorOfEachCar, int typeSelectionNumber, String typeValueString) {
        this.typeColorOfEachCar = typeColorOfEachCar;
        this.typeSelectionNumber = typeSelectionNumber;
        this.typeValueString = typeValueString;
    }

    public CarType getTypeColorOfEachCar() {
        return typeColorOfEachCar;
    }

    public int getTypeSelectionNumber() {
        return typeSelectionNumber;
    }

    public String getTypeValueString() {
        return typeValueString;
    }

    public static ColorType fromType(CarType inputCarType, String valueString) {
        for (ColorType colorType : ColorType.values()) {
            if (colorType.getTypeColorOfEachCar().equals(inputCarType)
                    && colorType.getTypeValueString().equalsIgnoreCase(valueString)) {
                return colorType;
            }
        }
        return null;
    }

}
