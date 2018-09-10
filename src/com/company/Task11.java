package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.09.2018.
 * Zad. 11 Odczytaj wyraz i zamień go na małe litery.
 */
public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Podaj wybrany przez siebie wyraz z użycie CAPS LOCKa: ");

        String word = sc.nextLine();
        System.out.println("Zmiana podanego przez Ciebie wyrazy na małe liery, to: " + word.toLowerCase());
    }
}
