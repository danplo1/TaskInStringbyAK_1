package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.09.2018.
 * Zad. 10 Odczytaj wyraz i wypisz na ekranie 3 krotnie wartość wyrazu..
 */
public class Task10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wybrany przez siebie wyraz: ");

        String word = s.nextLine();

        System.out.println("Podany przez Ciebie wyraz to: " + word + ", " + word + ", " + word + ", podany trzykrotnie.");

    }
}
