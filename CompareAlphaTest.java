package prj5;
import student.TestCase;

/**
 * Test class for the CompareAlpha class
 * 
 * @author Aniket Adhikari
 * @version 04.20.2021 v1
 *
 */
public class CompareAlphaTest extends TestCase {
    Race alien;
    Race human;
    CompareAlpha<Race> alpha;
    
    public void setUp()
    {
        alien = new Race("Alien", 100, 500);
        human = new Race("Human", 100, 500);
        alpha = new CompareAlpha<Race>();
    }
    
    /**
     * tests the compare method when the first parameter's
     * name comes before the second parameter's name 
     * alphabetically
     */
    public void testCompareNegative()
    {
        assertEquals(-1, alpha.compare(alien, human));
        
    }
    
    /**
     * tests the compare method when the second parameter's
     * name comes before the first parameter's name 
     * alphabetically
     */
    public void testComparePositive()
    {
        assertEquals(1, alpha.compare(human, alien));
    }
    
    /**
     * tests the compare method when we compare races 
     * with the same exact name
     */
    public void testCompareSame()
    {
        Race alienCopy = new Race("Alien", 0, 0);
        assertEquals(0, alpha.compare(alienCopy, alien));
    }
    
    /**
     * tests the compare method when we compare races 
     * with the same name but different casing 
     */
    public void testCompareCases()
    {
        Race lowerCaseHuman = new Race("hUmAn", 100, 500);
        assertEquals(0, alpha.compare(human, lowerCaseHuman));
    }
}
