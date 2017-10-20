package SEMINAR_1;

import java.util.Scanner;

/**
 * Created by Mihnea on 14.10.2017.
 */
public class Validation {

    public static void main(String[] args) {
        System.out.println("Dati nr: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println("Dati un numar intre 1 si "+ n);
        int nr = scanner.nextInt();

        while(nr < 1 || nr > n){
            System.out.println("Numarul nu este intre 1 si "+n+"! Reincercati:");
            nr = scanner.nextInt();
        }

        System.out.println("Arti dat "+nr);
    }
}
