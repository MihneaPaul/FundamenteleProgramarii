package SEMINAR_1;

/**
 * Created by Mihnea on 12.10.2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Se citesc două tablouri de lungimi egale. Să se facă diferent,a dintre primul s,
 i al doilea:
 se scad elementele de pe aceleas,
 i pozit,
 ii din tablourile citite
 */
public class Tema_Exercitiul3 {

    public static List<Integer> difference(int[]arrayA,int[]arrayB){
        List<Integer> difList = new ArrayList<>();


        for(int i=0;i<arrayA.length;i++){
            for(int j=0;j<arrayB.length;j++){
                if(i==j){
                    int dif = arrayA[i] - arrayB[j];
                    difList.add(dif);
                }
            }
        }
        return difList;
    }

    public static void main(String[] args) {
        System.out.println(difference(new int[]{9,8,7,6},new int[]{1,2,3,4}));
    }
}
