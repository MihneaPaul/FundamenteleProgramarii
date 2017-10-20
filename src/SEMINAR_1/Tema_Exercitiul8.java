package SEMINAR_1;

/**
 * Created by Mihnea on 13.10.2017.
 */

/**
 * Progresie
 Se citesc elementele definitorii ale unei progresii aritmetice: primul termen s,
 i rat,
 ia. Determinat,
 i
 suma primilor n termeni, n citit.

 a(n) = a(1) + (n-1)d
 */
public class Tema_Exercitiul8 {

    public static long arithmeticProgression(int elem, int ratio, int nbOfTerms){
        int sum = 0;
        for(int n=1;n<=nbOfTerms;n++){
            sum = sum + elem + (n-1)*ratio;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arithmeticProgression(2,7,15));
    }
}
