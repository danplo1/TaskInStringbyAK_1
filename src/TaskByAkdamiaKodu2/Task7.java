package TaskByAkdamiaKodu2;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 18.09.2018.
 * Zadanie7. Napisz program, który odczytuje imię i sprawdza czy wprowadzone imię jest męskie czy
 żeńskie.
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaje dowolne imię: ");

        String name = sc.next();

        if (name.endsWith("a")) {
            System.out.println("To jest imię żeńskie");
        } else {
            System.out.println("To jest imię męskie");

        }
    }
}