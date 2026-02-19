package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DateBaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DateLoaderTest01 {
    public static void main(String[] args) {
        DateBaseLoader dateBaseLoader = new DateBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dateBaseLoader.load();
        fileLoader.load();
    }
}
