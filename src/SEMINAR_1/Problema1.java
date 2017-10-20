package SEMINAR_1;

/**
 * Created by Mihnea on 14.10.2017.
 */

import java.util.Scanner;

/**
 * se citeste un numar n si un tablou de n numere cuprinse intre 1 si n. Sa se determine daca cele n numere sunt distincte.
 * ex: n = 4, tablou.length = 4, tablou format din [4,1,3,2] atunci e format din nr distincte
 */
public class Problema1 {

    public static boolean isDistinct(int n, int[] array) {
        for(int k=0;k<array.length;k++){
            if(array[k] < 1 || array[k] > n) {
                try {
                    throw new NotInIntervalException("Elementele sirului nu sunt in intervalul [1,n]");
                } catch (NotInIntervalException e){
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }
        if (array.length != n) {
            try {
                throw new NotNElementsException("Trebuie introdus un sir de n numere!");
            } catch (NotNElementsException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        return false;
                    }
                }
            }

        return true;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati numarul de elemente: ");
        int n = scanner.nextInt();

        int tabalou[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Dati al "+i+"-lea element");
            int nr = scanner.nextInt();
            tabalou[i] = nr;
        }
        System.out.println();
        boolean b = isDistinct(n,tabalou);
        if(b) {
            System.out.println("Numerele date sunt distincte.");
        } else {
            System.out.println("Numerele date nu sunt distincte");
        }

    }
}
