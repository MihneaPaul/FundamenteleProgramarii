package SEMINAR_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mihnea on 07.10.2017.
 */
public class OperatiiTablouri {

    static int array[];

    /**
     * Se citeste un tablout de n nr intregi.
     *
     * Sa se determine:
     * 1. Nr maxim din tablou
     * 2. Nr minim din tablout
     * 3. Suma elementelor din tablou.
     * 4. Elementele dintr-o groapa
     *  ~ spunem ca un element se afla intr-o groapa daca este mai mic decat elementele din stanga si dreapta sa. ~
     * 5. Elementele dintr-un munte.
     */

    public static int max(int[] arr){
        int maxNr = arr[0];

        for(int i=1;i<arr.length;i++) {
            if(arr[i] > maxNr)
                maxNr = arr[i];
        }
        return maxNr;
    }

    public static int min(int[] arr){
        int minNr = max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minNr)
                minNr = arr[i];
        }
        return minNr;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static ArrayList<Integer> getGroapa(int [] arr) {
        List<Integer> gropi = new ArrayList<>();
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i] < arr[i-1] && arr[i] < arr[i+1])
//                numere = numere + " " + arr[i] + " ";
                gropi.add(arr[i]);
        }
        return (ArrayList<Integer>) gropi;
    }

    public static String getMunte(int [] arr) {
        String numere = "";
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                numere = numere + " " + arr[i] + " ";
        }
        return numere;
    }

    public static void menu(){
        System.out.println("----- Menu -----");
        System.out.println("1 - Max     2 - Min     3 - Sum     4 - Groapa      5 - Munte");
        System.out.println();
        System.out.print("Introduceti selectia de la 1 la 5 SAU 0 pentru a termina:  ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        int nrOfElems;
        int array[];
        do {
            menu();
            selection = scanner.nextInt();
            switch(selection) {
                case 1:
                    System.out.print("Dati numarul de elemente din sir:  ");
                    nrOfElems = scanner.nextInt();
                    array = new int[nrOfElems];
                    for(int i = 0;i<array.length;i++){
                       System.out.print("Dati numarul:  ");
                       int nr = scanner.nextInt();
                       array[i] = nr;
                   }
                    System.out.println("Maximul este: "+max(array));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Dati numarul de elemente din sir:  ");
                    nrOfElems = scanner.nextInt();
                    array = new int[nrOfElems];
                    for(int i = 0;i<array.length;i++){
                        System.out.print("Dati numarul:  ");
                        int nr = scanner.nextInt();
                        array[i] = nr;
                    }
                    System.out.println("Minimul este: "+min(array));
                    System.out.println();
                    break;
            }
        } while (selection!=0);
//        System.out.println("Biggest element in array is: "+max(new int[]{1, 2, 3, 4, 7, 21, 11, 101, 22, 13, 29, 24, 15, 11}));
//        System.out.println("Smallest element is array is: "+min(new int[]{4,5,2,7,9,11}));
//        System.out.println("Sum of array elements is: "+sumArray(new int[]{121,242,353,464}));
//        List<Integer> gropi = getGroapa(new int[]{5,2,4,1,6,3,4});
//        System.out.println("Cele "+ gropi.size() + " gropi sunt: " + gropi);
//        System.out.println(getMunte(new int[]{1,4,2,5,7,6}));
    }
}
