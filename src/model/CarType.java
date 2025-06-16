/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum CarType {
    AUDI(1, "audi"),
    MERCEDES(2, "mercedes"),
    BMW(3, "bmw");

    private int typeSelectionNumber;
    private String typeValueString;

    private CarType(int typeSelectionNumber, String typeValueString) {
        this.typeSelectionNumber = typeSelectionNumber;
        this.typeValueString = typeValueString;
    }

    public int getTypeSelectionNumber() {
        return typeSelectionNumber;
    }

    public String getTypeValueString() {
        return typeValueString;
    }

    public static CarType fromType(String inputValue) {
        for (CarType carType : CarType.values()) {
            if (carType.getTypeValueString().equalsIgnoreCase(inputValue)) {
                return carType;
            }
        }
        return null;
    }
}
