package SEMINAR_1;

/**
 * Created by Mihnea on 10.10.2017.
 */

import java.util.Scanner;

/**
 * Se citeste un sir de n numere, iar apoi încă 5 numere. Să se determine la câte dintre cele
 5 numere si divide fiecare dintre cele n
 */
public class Tema_Exercitiul1 {

    public static void cevaMetoda() {
        Scanner scanner = new Scanner(System.in);

        // Crearea sirului

        System.out.print("Cate numere contine sirul?  ");
        int nrOfElems = scanner.nextInt();
        int array[] = new int[nrOfElems];
        System.out.print("Introduceti numerele din sir (fara ENTER duapa fiecare):  ");
        for (int i = 0; i < nrOfElems; i++) {
            int elem = scanner.nextInt();
            array[i] = elem;

        }
        System.out.print("Sirul de numere este: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        int fiveNumbers[] = new int[5];
        System.out.println("Introduceti cele 5 numere:  ");
        for(int i=0;i<5;i++){
           int nr = scanner.nextInt();
           fiveNumbers[i] = nr;
        }

        for(int j=0;j<array.length;j++){
            int count = 0;
            for(int k=0;k<fiveNumbers.length;k++){
                if(array[j]%fiveNumbers[k]==0){
                    count++;
                }
            }
            System.out.println("Numarul din sir de pe pozitia "+j+" se divide la "+count+" dintre cele 5 numere");
        }

    }

    public static void main(String[] args) {
        cevaMetoda();
    }
}
