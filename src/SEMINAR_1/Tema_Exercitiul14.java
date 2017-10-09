package SEMINAR_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mihnea on 09.10.2017.
 */

// 14. Numărătoare: Se citeste un număr n. Determinati câte pătrate perfecte există în intervalul [1, n].

public class Tema_Exercitiul14 {



    public static void getNrOfPerfectSquares(int lower, int upper) {
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
        System.out.println("Numarul patratelor perfect este: " + count);
        System.out.println("Patratele perfect sunt: "+pqList);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti capatul de jos intervalului:  ");
        int lowerInterval = scanner.nextInt();
        System.out.print("Introduceti capatul de sus al intervalului:  ");
        int upperInterval = scanner.nextInt();
//        System.out.println(upperInterval + " " + lowerInterval);

        getNrOfPerfectSquares(lowerInterval,upperInterval);
        String test = "f";
        System.out.println(Integer.parseInt(test));
    }
}
