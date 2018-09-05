package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 05.09.2018.
 *
 * Zad. 5 Napisz program, który odczytuje wyraz. Twoim zadaniem jest wypisanie przedostatniej litery wyrazu.
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = scanner.next();
        int length =word.length();

        System.out.println("Przedostanie słowo, z podanego przez Cienie wyrazu to : " + word.charAt(length-2));


    }
}
