package prj5;

import student.TestCase;

/**
 * Tests methods for Race Class
 * 
 * @author Jenny Tran
 * @version 2021.04.20
 */
public class RaceTest extends TestCase {
    private Race race;

    /**
     * Sets up test methods
     */
    public void setUp() {
        race = new Race("asian", 500, 5000);
    }


    /**
     * Tests if getter method returns race name
     */
    public void testGetRace() {
        assertEquals("asian", race.getRace());
    }


    /**
     * Tests if getter method returns number of deaths
     */
    public void testGetNumDeath() {
        assertEquals(500, race.getNumDeath());
    }


    /**
     * Tests if getter method returns number of positive cases
     */
    public void testGetNumPositive() {
        assertEquals(5000, race.getNumPositive());
    }


    /**
     * Tests if getter method returns CFR percent
     */
    public void testGetCFR() {
        assertEquals(10.0, race.getCFR(), 0.1);

        Race race2 = new Race("people", -1, 54);
        assertEquals(race2.getCFR(), -1.0, 0.1);
        race2 = new Race("people", 12, -1);
        assertEquals(race2.getCFR(), -1.0, 0.1);

    }


    /**
     * Tests if equals method returns if race equals another race
     */
    public void testEquals() {
        Race asian1 = new Race("asian", 500, 5000);
        Race asian2 = new Race("asian", 100, 5000);
        Race asian3 = new Race("asian", 500, 1000);
        Race black = new Race("black", 1000, 10000);

        assertEquals(race, race);
        assertTrue(race.equals(asian1));
        assertFalse(race.equals(black));
        assertFalse(race.equals(new Object()));
        assertFalse(race.equals(asian2));
        assertFalse(race.equals(asian3));

        Race race2 = null;

        assertFalse(race.equals(race2));

        assertFalse(race.equals(new Object()));

        race2 = race;

        assertTrue(race.equals(race2));
    }


    /**
     * Tests if correct string format of race is returned
     */
    public void testToString() {
        assertEquals("asian: 5000 cases, 10% CFR", race.toString());
    }

}
