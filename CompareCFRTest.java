package prj5;
import student.TestCase;

/**
* 
* @author Aniket Adhikari
* @version 04.22.2021 v1
*
*/
public class CompareCFRTest extends TestCase {
    
    private Race alien;
    private Race human;
    private CompareCFR<Race> cfr;
    
    public void setUp()
    {
        cfr = new CompareCFR<Race>();
        alien = new Race("Alien", 120, 352);
        human = new Race("Human", 100, 500);
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two two races where 
     * the 1st parameter has a greater CFR
     */
    public void testComparePositive()
    {
        assertEquals(1, cfr.compare(alien, human));
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two races where the 
     * 2nd parameter has a greater CFR 
     */
    public void testCompareNegative()
    {
        assertEquals(-1, cfr.compare(human, alien));
    }
    
    /**
     * tests the compare method for when we are 
     * comparing the CFRs of two races where the 
     * CFRs are equal
     */
    public void testCompareEqual()
    {
        Race alienCopy = new Race("Alien Copy", 120, 352);
        assertEquals(0, cfr.compare(alien, alienCopy));
    }

}
