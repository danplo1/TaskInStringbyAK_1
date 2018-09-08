package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 07.09.2018.
 */
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wybrane słowo: ");

        String word = scanner.next();
        char firstWord = word.charAt(0);

        System.out.println("Pierwsza litera podanego przez Ciebie słowa, to: " +firstWord );
    }

}