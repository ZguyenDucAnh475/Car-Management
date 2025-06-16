/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NguyenDucAnh
 */
public class InputHandle {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String regex = "[a-zA-Z0-9]+";
            String value = scanner.nextLine().trim();

            if (value.isEmpty()) {
                System.err.println("This value cannot be EMPTY!");
                continue;
            }

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(value);

            if (matcher.matches()) {
                return value;
            } else {
                System.err.println("Invalid Format! please input string!");
            }

        }
    }

    public int getUserLimitChoice(String msg, int min, int max) {
        while (true) {
            System.out.print(msg);
            String value = scanner.nextLine().trim();

            if (value.isEmpty()) {
                System.err.println("This value cannot be EMPTY!");
                continue;
            }

            try {
                int number = Integer.parseInt(value);

                if (number <= 0) {
                    System.err.println("This number must > 0!");
                    continue;
                }

                if (number < min || number > max) {
                    System.err.println(String.format("Please input between %d and %d",
                            min, max));
                    continue;
                }

                return number;

            } catch (NumberFormatException e) {
                System.err.println("This value must integer number");
            }
        }
    }

}
