package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 07.09.2018.
 */
public class Task5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        String word = sc.nextLine();
        int length = word.length();

        System.out.println("Przedostatnia litera podanego przez Ciebie wyrazu to: " + word.charAt(length-2));

    }
}


