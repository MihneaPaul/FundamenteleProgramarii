package SEMINAR_1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihnea on 14.10.2017.
 */
public class Problema1Test {
    @Test
    public void isDistinct() {
        assertTrue(Problema1.isDistinct(4,new int[]{1,2,3,4}));
        assertFalse(Problema1.isDistinct(5, new int[]{1,3,5,3,2}));
        assertFalse(Problema1.isDistinct(1, new int[]{1}));

    }

}