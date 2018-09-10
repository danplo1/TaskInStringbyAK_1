package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 10.09.2018.
 * Zad. 13 Wypisz true jeśli wyraz kończy się wyrazem “tka” bądź false jeśli wyraz nie kończy się na wyrazie “tka”.
 */
public class Task13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wybrany przez siebie wyraz: ");

        String word = s.nextLine();
        System.out.println(" Podany wyraz: " + word.contains("tka"));
    }
}
