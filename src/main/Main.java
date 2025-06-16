/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.CarController;
import java.util.Calendar;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    private CarController carController = new CarController();

    private void run() {
        carController.getView();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main().run();
    }

}
