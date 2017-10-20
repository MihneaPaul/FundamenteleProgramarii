package SEMINAR_1;

/**
 * Created by Mihnea on 13.10.2017.
 */

/**
 * Suma puterilor
 Se citesc două numere p s,
 i k. Să se determine suma p + p
 2 + ... + p
 p
 totul modulo k
 */
public class Tema_Exercitiul6 {

    public static int sumOfPow(double p, int k){
        int temp = 1;
        int sum = 0;
        for(int i = 1;i<=p;i++){
            temp = (int) Math.pow(p,i);
            sum += temp;
        }
        return sum%k;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPow(5,4));
    }
}
