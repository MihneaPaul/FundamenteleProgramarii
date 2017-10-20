package SEMINAR_1;

/**
 * Created by Mihnea on 13.10.2017.
 */

/**
 * Divizori
 Se cites,
 te un număr. Să se determine suma divizorilor proprii (diferit,
 i de 1 s,
 i el însus,
 i)
 */
public class Tema_Exercitiul5 {

    public static int sumOfDivisors(int nb){
        int sum = 0;
        for(int i=2;i<= nb/2;i++){
            if(nb%i == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDivisors(6));
    }
}
