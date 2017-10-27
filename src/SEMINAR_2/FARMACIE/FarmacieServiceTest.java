package SEMINAR_2.FARMACIE;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihnea on 27.10.2017.
 */
class FarmacieServiceTest {
//    private static List<MedicamentBean> beans = new ArrayList<>();

    @Test
    void addMed() {
        FarmacieService service = new FarmacieService();
        try {
            service.addMed("",25);
            fail("Exceptie nelansata");
        } catch (IllegalArgumentException e){
            assertEquals("Nume invalid", e.getMessage());
        }

        try {
            service.addMed("xyz",25);
            fail("Exceptie nelansata");
        } catch (IllegalArgumentException e){
            assertEquals("Nume invalid", e.getMessage());
        }


        int beforeLength = service.getLength();
        service.addMed("xyz", 30);
        int afterLength = service.getLength();
        assertNotEquals(beforeLength, afterLength);
    }


}