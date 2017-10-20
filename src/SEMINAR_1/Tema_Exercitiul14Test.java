package SEMINAR_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihnea on 17.10.2017.
 */
class Tema_Exercitiul14Test {
    @Test
    void getNrOfPerfectSquares() {
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,25),4);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,36),5);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,49),6);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,64),7);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,3),0);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(2,2),0);
        assertEquals(Tema_Exercitiul14.getNrOfPerfectSquares(-1,2),0);


    }

}