package TaskByAkdamiaKodu2;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 19.09.2018.
 * Zagadnienie String:
 * Zad. 9
 * Napisz program, który odczytuje wyraz i sprawdza czy dany wyraz jest palindromem.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jedno słowo: ");
        String word = scanner.nextLine();

        int a = word.length();

        int b = 2;
        int c = (a - 1);

        for (int i = 0; i < a; i++) {
            if (word.charAt(i) != word.charAt(c)) {
                b = 1;
            } else {
                b = 0;
            }
            c--;
        }
        if (b == 0)
            System.out.println("Podane przez Ciebie słowo jest palindromem.");
        if (b == 1)
            System.out.println("Podane przez Ciebie słowo nie jest palindromem.");
    }
}







