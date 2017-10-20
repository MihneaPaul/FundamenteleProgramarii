package SEMINAR_1;

/**
 * Created by Mihnea on 13.10.2017.
 */

/**
 * 7. Factorial
 Se cites,
 te un număr n. Să se determine factorialul său: n! = 1 · 2 · · · · n.
 */
public class Tema_Exercitiul7 {

    public static int factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        return (factorial(n-1)*n);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
