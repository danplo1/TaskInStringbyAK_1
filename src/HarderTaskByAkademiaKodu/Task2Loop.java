package HarderTaskByAkademiaKodu;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 25.09.2018.
 * Napisz program, który oblicza NWD 2 liczb:
 * Algorytm Euklidesa
 */
public class Task2Loop {

    static int NWD(int a, int b) {
        int c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość a: ");
        int a = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość b: ");
        int b = scanner.nextInt();

        System.out.println("Największy wspólny dzielnik (NWD) to: "+ NWD(a,b));


    }
}
