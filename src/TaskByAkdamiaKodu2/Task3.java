package TaskByAkdamiaKodu2;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 13.09.2018.
 * Zad. 3 Stwórz program, który odczytuje wiek danej osoby i sprawdza czy osoba jest
 nastolatkiem ( wiek pomiędzy 13 i 18).
 */
public class Task3 {
    public static void main(String[] args) {

        System.out.println("Podaj wiek osoby: ");
        Scanner scanner = new Scanner(System.in);

       int age = scanner.nextInt();
        if (age<13||age>18){
            System.out.println("Sorry, nie jestes nastolatkiem.");
        }else{
            System.out.println("Masz " + age + " lat, więc jesteś nastolatkiem!");
        }

    }
}
