package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 05.09.2018.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wybrane przez siebie słowo: ");

        String word = scanner.nextLine();
        System.out.println("Długość podanego przez Ciebie słowa wynosi: " + word.length() + " liter.");

    }
}
