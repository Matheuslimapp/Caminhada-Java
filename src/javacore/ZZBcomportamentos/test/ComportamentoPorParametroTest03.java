package javacore.ZZBcomportamentos.test;

import javacore.ZZBcomportamentos.dominio.Car;
import javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
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
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterwhiteList = new ArrayList<>();
        for (T e: list){
            if (predicate.test(e)){
                filterwhiteList.add(e);
            }
        }
        return filterwhiteList;
    }
}
