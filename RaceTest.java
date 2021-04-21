import student.TestCase;

/**
 * 
 * @author Tran
 * @version 2021.04.20
 */

public class RaceTest extends TestCase {
    Race race;

    public void setUp() {
        race = new Race("asian", 500, 5000);
    }


    public void testGetRace() {
        assertEquals("asian", race.getRace());
    }


    public void testGetNumDeath() {
        assertEquals(500, race.getNumDeath());
    }


    public void testGetNumPositive() {
        assertEquals(5000, race.getNumPositive());
    }


    public void testGetCFR() {
        assertEquals(10.0, race.getCFR());
    }


    public void testEquals() {
        Race asian1 = new Race("asian", 500, 5000);
        Race asian2 = new Race("asian", 100, 5000);
        Race asian3 = new Race("asian", 500, 1000);
        Race black = new Race("black", 1000, 10000);

        assertEquals(race, race);
        assertEquals(race, asian1);
        assertEquals(false, race.equals(black));
        assertEquals(false, race.equals(new Object()));
        assertEquals(false, race.equals(asian2));
        assertEquals(false, race.equals(asian3));
    }
}
