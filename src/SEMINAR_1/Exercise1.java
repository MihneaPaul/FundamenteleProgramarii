package SEMINAR_1;

/**
 * se citeste un nr intre n. sa se afiseze de cate ori apare cifra 3 in toat enr de la  la n inclusiv.
 */
public class Exercise1 {

    /** calculeaza numarul aparitiilor cifrei 3 intr-un numar. */

    public static int cifra3InNumar(int nr) {
        int count = 0;
        while(nr !=0) {
            int ultimaCifra = nr%10;
            if(ultimaCifra == 3){
                count++;
            }
            nr = nr/10;
        }
        return count;
    }

    /**
     * Determina nr de aparitii ale lui 3 in intervalul [1,limita].
     * @param limit Limita data
     * @return De cate ori apare 3 in interval
     */

    public static int cifre3InInterval(int limit) {
        int count = 0;
        for (int i=1;i<=limit;i++) {

            count += cifra3InNumar(i);

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(cifre3InInterval(33));
    }
}
