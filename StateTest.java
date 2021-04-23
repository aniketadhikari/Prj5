package prj5;

import student.TestCase;

/**
 * @author Aniket Adhikari
 * @version 04.19.2021
 */
public class StateTest extends TestCase {
    private LinkedList<Race> demographics;
    private State virginia;

    /**
     * runs before every execution
     */
    public void setUp() {
        demographics = new LinkedList<Race>();
        demographics.add(new Race("latinx", 150, 500));
        demographics.add(new Race("black", 300, 500));
        demographics.add(new Race("asian", 250, 500));
        demographics.add(new Race("other", 100, 500));
        demographics.add(new Race("white", 200, 500));
        virginia = new State(demographics, "VA");

    }


    /**
     * tests the toString method which lists the races
     * in the state along with the cases and CFR 
     * associated with each race
     */
    public void testToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VA \n");
        sb.append("asian: 500 cases, 50.0% CFR \n");
        sb.append("black: 500 cases, 60.0% CFR \n");
        sb.append("latinx: 500 cases, 30.0% CFR \n");
        sb.append("other: 500 cases, 20.0% CFR \n");
        sb.append("white: 500 cases, 40.0% CFR \n");
        sb.append("===== \n");
        sb.append("black: 500 cases, 60.0% CFR \n");
        sb.append("asian: 500 cases, 50.0% CFR \n");
        sb.append("white: 500 cases, 40.0% CFR \n");
        sb.append("latinx: 500 cases, 30.0% CFR \n");
        sb.append("other: 500 cases, 20.0% CFR \n");
        assertEquals(sb.toString(), virginia.toString());

    }

    /**
     * tests the getStateName method 
     */
    public void testGetStateName() {
        assertEquals("VA", virginia.getStateName());
    }


    /**
     * tests the callSortAlpha method 
     */
    public void testCallSortAlpha() {
        StringBuilder unsorted = new StringBuilder();
        unsorted.append("{latinx: 500 cases, 30.0% CFR, ");
        unsorted.append("black: 500 cases, 60.0% CFR, ");
        unsorted.append("asian: 500 cases, 50.0% CFR, ");
        unsorted.append("other: 500 cases, 20.0% CFR, ");
        unsorted.append("white: 500 cases, 40.0% CFR}");
        assertEquals(demographics.toString(), unsorted.toString());
        StringBuilder sortedAlpha = new StringBuilder();
        sortedAlpha.append("{asian: 500 cases, 50.0% CFR, ");
        sortedAlpha.append("black: 500 cases, 60.0% CFR, ");
        sortedAlpha.append("latinx: 500 cases, 30.0% CFR, ");
        sortedAlpha.append("other: 500 cases, 20.0% CFR, ");
        sortedAlpha.append("white: 500 cases, 40.0% CFR}");
        virginia.callSortAlpha();
        assertEquals(demographics.toString(), sortedAlpha.toString());
        
    }
    
    /**
     * tests the callSortCFR method 
     */
    public void testCallSortCFR() {
        StringBuilder unsorted = new StringBuilder();
        unsorted.append("{latinx: 500 cases, 30.0% CFR, ");
        unsorted.append("black: 500 cases, 60.0% CFR, ");
        unsorted.append("asian: 500 cases, 50.0% CFR, ");
        unsorted.append("other: 500 cases, 20.0% CFR, ");
        unsorted.append("white: 500 cases, 40.0% CFR}");
        assertEquals(demographics.toString(), unsorted.toString());
        StringBuilder sortedCFR = new StringBuilder();
        sortedCFR.append("{black: 500 cases, 60.0% CFR, ");
        sortedCFR.append("asian: 500 cases, 50.0% CFR, ");
        sortedCFR.append("white: 500 cases, 40.0% CFR, ");
        sortedCFR.append("latinx: 500 cases, 30.0% CFR, ");
        sortedCFR.append("other: 500 cases, 20.0% CFR}");
        virginia.callSortCFR();
        assertEquals(demographics.toString(), sortedCFR.toString());
    }

}
