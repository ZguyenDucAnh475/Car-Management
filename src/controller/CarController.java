package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import model.CarType;
import model.ColorType;
import model.DaySellCar;
import model.Days;
import model.PriceCar;
import utils.InputHandle;
import view.ProgramView;

public class CarController {

    private final ProgramView view = new ProgramView();
    private final String pathMessageProgram = "model.notice";
    private final Locale setLocale = Locale.ENGLISH; // hoặc Locale.forLanguageTag("vi-VN")

    public void getView() {
        view.menuView();
    }

    // get message for in/out put
    private String getMessage(Locale currentLocale, String key, String path) {
        return ResourceBundle.getBundle(path, currentLocale).getString(key) + " ";
    }

    public void run() {
        view.printTitle("Showroom car program");
        view.printView("%s", "Input information of car");

        // Input car type
        String carInput = InputHandle.getString("Enter car type (e.g., AUDI, BMW): ");
        CarType name = parseCarBranchString(carInput);

        // Input color type
        String colorInput = InputHandle.getString("Enter color (e.g., RED, BLUE): ");
        ColorType color = parseColorTypeString(colorInput);

        // Input price
        String priceInputString = InputHandle.getString("Enter price (number only): ");
        int priceInput = Integer.parseInt(priceInputString);
        PriceCar price = parsePriceCarString(priceInput, name);

        // Input day sell car
        String daySellInput = InputHandle.getString("Enter day sell (e.g., AUDI_DAYSELL): ");
        Days daySellCar = parseDaySellCarString(daySellInput, name);

        System.out.println("Car Type: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price Index: " + (price != null ? getPriceIndex(name, priceInput) : "N/A"));
        System.out.println("Day Sell: " + daySellCar);
    }

    private int getPriceIndex(CarType carType, int inputValuePrice) {
        int index = 0;
        for (PriceCar priceCar : PriceCar.values()) {
            if (priceCar.getCarType().equals(carType)) {
                for (int i = 0; i < priceCar.getPrices().length; i++) {
                    if (priceCar.getPrices()[i] == inputValuePrice) {
                        index = i;
                    }
                }
            }
        }
        return index;
    }

    // FUNC: parse string to CarType
    private CarType parseCarBranchString(String value) {
        while (true) {
            try {
                if (value.isEmpty()) {
                    System.err.println(getMessage(setLocale, "errorEmpty", pathMessageProgram));
                    value = InputHandle.getString("Re-enter car type: ");
                    continue;
                }

                return CarType.fromType(value.toUpperCase());
            } catch (Exception e) {
                System.err.println("Cannot parse this string to CarType! Try again.");
                value = InputHandle.getString("Re-enter car type: ");
            }
        }
    }

    private ColorType parseColorTypeString(String value) {
        while (true) {
            try {
                if (value.isEmpty()) {
                    System.err.println(getMessage(setLocale, "errorEmpty", pathMessageProgram));
                    value = InputHandle.getString("Re-enter color type: ");
                    continue;
                }

                return ColorType.valueOf(value.toUpperCase());
            } catch (Exception e) {
                System.err.println("Invalid color type! Try again.");
                value = InputHandle.getString("Re-enter color type: ");
            }
        }
    }

    private PriceCar parsePriceCarString(int inputValue, CarType carType) {
        try {

            for (PriceCar priceCar : PriceCar.values()) {
                if (priceCar.getCarType().equals(carType)) {
                    for (int i = 0; i < priceCar.getPrices().length; i++) {
                        if (priceCar.getPrices()[i] == inputValue) {
                            return priceCar;
                        }
                    }
                }
            }
            return null;
        } catch (NumberFormatException e) {
            System.err.println("Invalid price format!");
            return null;
        }
    }

    private List<String> getValueIndex(CarType carType) {
        List<String> getDayStrings = new ArrayList<>();
        for (DaySellCar daySellCar : DaySellCar.values()) {
            if (daySellCar.getCarType().equals(carType)) {
                for (int i = 0; i < daySellCar.getDaySellCars().length; i++) {
                    for (Days day : Days.values()) {
                        if (daySellCar.getDaySellCars()[i] == day.getTypeSelectionNumber()) {
                            getDayStrings.add(day.getTypeValueString());
                            break;
                        }
                    }
                }
            }
        }
        return getDayStrings;
    }

    private Days parseDaySellCarString(String inputDayValue, CarType carType) {
        List<String> getList = getValueIndex(carType);
        try {
            Days getDayValue = null;
            for (int i = 0; i < getList.size(); i++) {
                if (getList.get(i).equalsIgnoreCase(inputDayValue)) {
                    getDayValue = Days.fromDay(inputDayValue);
                }
            }

            return getDayValue;
        } catch (Exception e) {
            System.err.println("Invalid DaySellCar! Return null.");
            return null;
        }
    }
}
