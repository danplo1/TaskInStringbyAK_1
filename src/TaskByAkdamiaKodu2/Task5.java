package TaskByAkdamiaKodu2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Daniel_D'AGE on 13.09.2018.
 */
public class Task5 {
    public static void main(String[] args) {

        LocalDate localDate =  LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("Dzisiejsza data to: " + localDate + " , godzina: " + localTime);
    }
}
