package personnagetest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import personnage.Personnage;

    public class PersonnageTest {

        @Test
        public void testTourner1() {
            Personnage personnage = new Personnage();
            assertEquals("EST", personnage.tourner(1));
        }

        @Test
        public void testTourner2() {
            Personnage personnage = new Personnage();
            assertEquals("SUD", personnage.tourner(2));
        }

        @Test
        public void testTourner3() {
            Personnage personnage = new Personnage();
            assertEquals("OUEST", personnage.tourner(3));
        }

        @Test
        public void testTourner4() {
            Personnage personnage = new Personnage();
            assertEquals("NORD", personnage.tourner(4));
        }

        @Test
        public void testTourner5() {
            Personnage personnage = new Personnage();
            assertEquals("EST", personnage.tourner(5));
        }

        @Test
        public void testTournerNegative() {
            Personnage personnage = new Personnage();
            assertEquals("OUEST", personnage.tourner(-1));
        }
    }
