package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 09.09.2018.
 * Zad. 8 Odczytaj wyraz i wypisz 2 ostatnie litery wyrazu.
 */
public class Task8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wybrany przez siebie wyraz: ");

        String word = scanner.nextLine();

        int length = word.length();

        System.out.println("Dwie ostatanie litery wyrazu podanego przez Ciebie, to: " + word.charAt(length-2) +
        word.charAt(length-1));



    }
}
