/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum Days {
    MONDAY(1, "monday"),
    TUESDAY(2, "tuesday"),
    WEDNESDAY(3, "wednesday"),
    THURSDAY(4, "thursday"),
    FRIDAY(5, "friday"),
    SATURDAY(6, "saturday"),
    SUNDAY(7, "sunday");

    private int typeSelectionNumber;
    private String typeValueString;

    private Days(int typeSelectionNumber, String typeValueString) {
        this.typeSelectionNumber = typeSelectionNumber;
        this.typeValueString = typeValueString;
    }

    public int getTypeSelectionNumber() {
        return typeSelectionNumber;
    }

    public String getTypeValueString() {
        return typeValueString;
    }

    public String[] getValue(int[] numbers) {
        int i = 0;
        for (Days day : Days.values()) {
            if (day.getTypeSelectionNumber() == numbers[i]) {
                while (numbers.length > i) {
                    i++;
                }
            }
        }
        return new String[]{getTypeValueString()};
    }

    public static Days fromDay(String inputDay) {
        for (Days day : Days.values()) {
            if (day.getTypeValueString().equalsIgnoreCase(inputDay)) {
                return day;
            }
        }
        return null;
    }
}
