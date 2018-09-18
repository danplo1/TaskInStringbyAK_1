package HarderTaskByAkademiaKodu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel_D'AGE on 18.09.2018.
 * Zad. 1 Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz jest kodem
 * pocztowym. Wyrażenia regularne!
 */
public class Task1String {
    public static void main(String[] args) {


        Pattern patt = Pattern.compile("^[0-9]{2}-[0-9]{3}$"); //wzorzec do sprawdzania kodu pocztowego

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wPodaj kod pocztowy: ");
        String word = scanner.nextLine();
        Matcher match = patt.matcher(word);

        if (match.matches()){
            System.out.println("To jest poprawnie wpisany kod pocztowy.");
        }else{
            System.out.println("To nie jest kod pocztowy!");
        }
    }
}