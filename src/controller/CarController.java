/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CarType;
import model.ColorType;
import model.DaySellCar;
import model.Days;
import model.PriceCar;
import utils.InputHandle;
import view.ProgramView;

/**
 *
 * @author NguyenDucAnh
 */
public class CarController {

    private ProgramView view = new ProgramView();
    private InputHandle inputHandle = new InputHandle();

    public void getView() {
        view.menuView();
    }

    public void run() {
        view.printTitle("Showroom car program");
        view.printView("%s", "Input information of car");
        CarType name = CarType.AUDI;
        ColorType color = null;
        PriceCar price = null;
        DaySellCar daySellCar = null;


    }



}
