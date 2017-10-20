package SEMINAR_1;

/**
 * Created by Mihnea on 10.10.2017.
 */

import java.util.Scanner;

/**
 * Se citeste un număr natural. Calculati suma cifrelor sale.
 */
public class Tema_Exercitiul2 {

    public static long sumOfDigits(long nr){
        long sum = 0;
        boolean b = true;
        while(b) {
            sum = sum + nr % 10;
//            System.out.println("nr%10 is: " + nr % 10);
//            System.out.println("sum is: " + sum);
            nr = nr / 10;
//            System.out.println("nr is: " + nr);
            if (nr < 10) {
//                System.out.println("ENTERING IF");
//                System.out.println("nr is: " + nr);
                sum = sum + nr;
                b = false;
            }
        }
        return sum;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number:  ");
        long number = scanner.nextLong();
        System.out.println();
        System.out.println("Sum of digits of number "+number +" is: "+sumOfDigits(number));
    }
}
