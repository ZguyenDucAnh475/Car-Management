/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum PriceCar {

    AUDI_PRICE(new int[]{5500, 3000, 4500}, CarType.AUDI),
    MERCEDES_PRICE(new int[]{5000, 6000, 8500}, CarType.MERCEDES),
    BMW_PRICE(new int[]{2500, 3000, 3500}, CarType.BMW);

    private int[] prices;
    private CarType carType;

    private PriceCar(int[] prices, CarType carType) {
        this.prices = prices;
        this.carType = carType;
    }

    public int[] getPrices() {
        return prices;
    }

    public CarType getCarType() {
        return carType;
    }

    public static PriceCar fromPrice(CarType carType) {

        for (PriceCar car : PriceCar.values()) {
            if (car.getCarType().equals(carType)) {
                return car;
            }
        }
        return null;
    }

//    @Override
//    public String toString() {
//        StringBuilder out = new StringBuilder();
//        int i = 0;
//        while (prices.length > i) {
//            out.append(prices[i]);
//            if (i < prices.length - 1) {
//                out.append(", ");
//            }
//            i++;
//        }
//        return out.toString();
//    }

}
