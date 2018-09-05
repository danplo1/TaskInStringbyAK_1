package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 05.09.2018.
 */
public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = scanner.next();

        System.out.println("Podaj swoje nazwisko: ");
        String surname =scanner.next();

        System.out.println("Twoje imię i nazwisko to: " + name + " " + surname);




    }
}
