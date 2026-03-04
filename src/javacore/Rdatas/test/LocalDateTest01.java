package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.*;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2026, Month.MARCH,12);
        LocalDate agora = LocalDate.now();
        agora.plusWeeks(4);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);





        //Não tem na aula eu que fiz
//        List<LocalDate> datas = Arrays.asList(
//                LocalDate.of(2026, 3, 1),
//                LocalDate.of(2026, 3, 2),
//                LocalDate.of(2026, 3, 3)
//        );
//        for (int i = 0; i<datas.size(); i++){
//            System.out.println(datas.get(i));
//        }
    }
}
