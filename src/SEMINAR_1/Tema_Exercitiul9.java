package SEMINAR_1;

/**
 * Created by Mihnea on 13.10.2017.
 */

import java.util.Scanner;

/**
 * Collatz
 Se cites,
 te un număr n. Afis, at,
 i fiecare pas al aplicării conjecturii Collatz: dacă n e par, se
 injumătăt,es,
 te. Dacă e impar s,
 i diferit de 1, devine 3n+ 1. Dacă e 1, se opres,
 te algoritmul.

 */
public class Tema_Exercitiul9 {

    public static void collatz(){
        Scanner scanner = new Scanner(System.in);
        int var = 0;

        System.out.print("Enter number:   ");

        int number = scanner.nextInt();

        while(true) {

            if(number%2 == 0){
                var = number / 2;
                System.out.println("Number is even => number will become " + var);
            }
            else if(number%2!=0 & number!=1){
                var = (3*number+1);
                System.out.println("Number is odd and not 1 => number will become " + var);
            }
            number = var;
            if(number == 1)
                break;
        }
    }

    public static void main(String[] args) {
        collatz();
    }
}
