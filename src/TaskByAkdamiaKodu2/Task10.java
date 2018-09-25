package TaskByAkdamiaKodu2;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Daniel_D'AGE on 19.09.2018.
 * Zagadnienie pętle:
 * Napisz program, który losuje liczby dużego lotka (6 liczb).
 */
public class Task10 {
    public static void main(String[] args) {



        Random random = new Random();

        int number;

        for (int i = 1; i <= 6; i++) {

            number = random.nextInt((49)+1);

            System.out.println(number);

        }
    }
}



