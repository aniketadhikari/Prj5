package prj5;
import student.TestCase;

/**
 * @author Aniket Adhikari
 *
 */
public class StateTest {
    private LinkedList<Race> demographics;
    private State virginia;
    
    /**
     * runs before every execution
     */
    public void setUp()
    {
        demographics = new LinkedList<Race>();
        virginia = new State(demographics, "Virginia");
    }
}
