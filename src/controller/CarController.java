/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import java.util.ResourceBundle;
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

    public void getView() {
        view.menuView();
    }

    // get message for in/out put
    private String getMessage(Locale currentLocale, String key, String path) {
        ResourceBundle getValue = ResourceBundle.getBundle(path + currentLocale, currentLocale);
        String value = getValue.getString(key);
        return value + " ";
    }

    public void run() {
        view.printTitle("Showroom car program");
        view.printView("%s", "Input information of car");
        CarType name = CarType.AUDI; // demo AUDI branch car
        ColorType color = null;
        PriceCar price = null;
        DaySellCar daySellCar = null;
    }

    // FUNC: parse string to object
    private CarType parseCarBranchString(String value){
        return null;
    }
    
    private ColorType parseColorTypeString(String value){
        return null;
    }
    
    private PriceCar parsePriceCarString(String value){
        return null;
    }
    
    private DaySellCar parseDaySellCarString(String value){
        return null;
    }
}
