package TaskByAkdamiaKodu2;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 13.09.2018.
 * Zad. 4 Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony napis to
 Akademia.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj hasło: ");

        String word = sc.nextLine();
        if(word.contains("Akademia")){
            System.out.println("Podałeś poprawne hasło!");
        }else{
            System.out.println("Podałeś niepoprawne hasło! Brak dostępu!");
        }
    }
}
