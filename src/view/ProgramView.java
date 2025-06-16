/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author NguyenDucAnh
 */
public class ProgramView {

    public void printView(String format, Object... in) {
        System.out.println(String.format(format, in));
    }

    private String s1 = " ================== ";

    public void printTitle(String in) {
        System.out.println(s1 + in + s1);
    }

    private void printValueArray(String[] values, String notice) {
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (values.length > i) {
            out.append(values[i].toUpperCase());
            if (i < values.length - 1) {
                out.append(", ");
            }
            i++;
        }
        printView("%5s: %s", notice, out.toString());
    }

    private void newLine() {
        System.out.println("");
    }

    public void menuView() {
        // audi
        printView("%s:", "audi".toUpperCase());
        printValueArray(new String[]{"white", "yellow", "orange"}, "Available colors");
        printValueArray(new String[]{"5500", "3000", "4500"}, "Price");
        printValueArray(new String[]{"friday", "sunday", "monday"}, "Sold on");
        newLine();
        // mercedes
        printView("%s:", "mercedes".toUpperCase());
        printValueArray(new String[]{"green", "blue", "purple"}, "Available colors");
        printValueArray(new String[]{"5000", "6000", "8500"}, "Price");
        printValueArray(new String[]{"tuesday", "saturday", "wednesday"}, "Sold on");
        newLine();
        // bmw
        printView("%s:", "bmw".toUpperCase());
        printValueArray(new String[]{"pink", "red", "brown"}, "Available colors");
        printValueArray(new String[]{"2500", "3000", "3500"}, "Price");
        printValueArray(new String[]{"monday", "sunday", "thursday"}, "Sold on");
        newLine();
    }

}
