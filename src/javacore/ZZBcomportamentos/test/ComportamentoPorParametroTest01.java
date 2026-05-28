package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Black", 2011), new Car("White", 2319), new Car("Gray", 2000));

    public static void main(String[] args) {
        System.out.println(filterBlackCar(cars));
        System.out.println(filterByColor(cars, "Gray"));
        System.out.println(filterByColor(cars, "White"));
        System.out.println("-------");
        System.out.println(filterByAge(cars, 2015));
    }


    private static List<Car>  filterBlackCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Black")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car>  filterByColor(List<Car> cars, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
    private static List<Car>  filterByAge(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
