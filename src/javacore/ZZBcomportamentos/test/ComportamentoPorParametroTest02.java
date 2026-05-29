package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Car;
import javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Black", 2011), new Car("White", 2319), new Car("Gray", 2000));

    public static void main(String[] args) {
//        List<Car> blackCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Black");
//            }
//        });
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("Black"));
        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("White"));
        List<Car> yearByAge = filter(cars, car -> car.getYear() < 2015);
        System.out.println(blackCars);
        System.out.println(whiteCars);
        System.out.println(yearByAge);

    }


    private static List<Car> filter (List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
