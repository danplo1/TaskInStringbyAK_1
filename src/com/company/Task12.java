package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.09.2018.
 * Zad. 12  Odczytaj wyraz i zamień * pustym ciągiem. Przykładowo dla ciągu znaków a*bcd ma być wypisany wyraz abcd.
 */
public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wybrany przez siebie wyraz z gwiazdką: ");

        String word = scanner.nextLine();
        System.out.println("Podany przez Ciebie wyraz z *: " + word.replace("*", ""));
    }
}
