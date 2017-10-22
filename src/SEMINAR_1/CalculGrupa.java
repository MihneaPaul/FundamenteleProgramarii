package SEMINAR_1;

/**
 * Created by Mihnea on 07.10.2017.
 */
public class CalculGrupa {
    public static String calculSpentruOrar(int nrGrupa, int nrSemiGrupa) {
        int numarS = 2*(nrGrupa-1) + nrSemiGrupa;
        return "S" + numarS;
    }

    public static void main(String[] args) {
        System.out.println(calculSpentruOrar(1,2));
    }
}
