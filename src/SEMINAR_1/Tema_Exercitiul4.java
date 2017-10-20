package SEMINAR_1;

/**
 * Created by Mihnea on 12.10.2017.
 */

import java.util.Arrays;

/**
 * Se cites,
 te un tablou. Să se creeze un nou tablou pe baza celui citit care are proprietatea
 de mult,
 ime: fiecare număr apare o singură dată.
 */
public class Tema_Exercitiul4 {

    public static int[] createUniqueArray(int array[]){
        int[] uniqueArray = removeDuplicates(array);

        System.out.println(Arrays.toString(uniqueArray));
        return uniqueArray;
    }

    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);

        int[] resultArray = new int[array.length];
        int previous = array[0];
        resultArray[0] = previous;

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            if (previous != temp) {
                resultArray[i] = temp;
            }
            previous = temp;
        }
        return resultArray;

    }

    static int[] addTOArray(int[] newArray, int elem) {
//        System.out.println(Arrays.toString(newArray));
        newArray  = Arrays.copyOf(newArray, newArray.length + 1);
//        System.out.println(Arrays.toString(newArray));
//        System.out.println(elem);
            newArray[newArray.length - 1] = elem;
//        System.out.println(newArray[newArray.length-1]);
        return newArray;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(createUniqueArray(new int[]{1,1,2,1,2})));
//        int[] testArray = new int[]{1,3,4};
//        testArray = addTOArray(testArray,5);
//        System.out.println(Arrays.toString(testArray));
    }
}
