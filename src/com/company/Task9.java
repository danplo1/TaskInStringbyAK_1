package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 09.09.2018.
 * Zad. 9 Odczytaj wyraz i wypisz na ekran wartość true lub false w zależności od tego czy wyraz zawiera w sobie napis kot.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        String word = sc.nextLine();
        System.out.println(word.contains("kot"));
    }
}
