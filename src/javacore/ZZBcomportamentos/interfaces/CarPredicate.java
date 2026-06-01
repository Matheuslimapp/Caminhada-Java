package javacore.ZZBcomportamentos.interfaces;

import javacore.ZZBcomportamentos.dominio.Car;
@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções, conciso(Reduzir Codigo)
    boolean test(Car car);
    //(parametro) -> exepressão
    //(Car car) -> car.getColor().equals("green");
}
