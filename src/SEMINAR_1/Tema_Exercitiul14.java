package SEMINAR_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mihnea on 09.10.2017.
 */

// 14. Numărătoare: Se citeste un număr n. Determinati câte pătrate perfecte există în intervalul [1, n].

public class Tema_Exercitiul14 {


    public static int getNrOfPerfectSquares(int lower, int upper) {
//        System.out.println(lower);
//        System.out.println(upper);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> pqList = new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            list.add(i);
        }
//        System.out.println(list);

        for(int x : list){
            if(Math.sqrt(x) == (int)Math.sqrt(x)) {
                count++;
                pqList.add(x);
            }
        }
        System.out.println("The perfect squares are: "+pqList);
        System.out.println();
        return count;
//        System.out.println("Numarul patratelor perfect este: " + count);
    }

    public static void printMenu(){
        System.out.print("1  Citire date    ");
        System.out.print("2  Rezolvare problema    ");
        System.out.print("x  Exit    ");
    }
    public static void main(String[] args) {
        int lowerInterval = 0;
        int upperInterval = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("test 1");
            String selection;
            printMenu();
            System.out.println("test 2");
            System.out.println();
            System.out.println("Selectati varianta:  ");
            selection = scanner.nextLine();

            switch (selection){
                case "1":
                    System.out.print("Introduceti capatul de jos intervalului:  ");
                    lowerInterval = scanner.nextInt();
                    System.out.print("Introduceti capatul de sus al intervalului:  ");
                    upperInterval = scanner.nextInt();
                    System.out.println();
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Number perfect squares between [," + lowerInterval + " " + upperInterval + "] is: " + getNrOfPerfectSquares(lowerInterval,upperInterval));
                    System.out.println();
                    break;

                case "x":
                    System.exit(1);
            }
        }
//        System.out.println(upperInterval + " " + lowerInterval);

    }
    

}
