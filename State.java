package prj5;
/**
 * 
 * @author Aniket Adhikari
 * @version 04.19.2021 v1
 * 
 * The state in which we are measuring the affects 
 * COVID has had on different segments of the 
 * population. 
 *
 */

public class State {
    
    private String stateName;
    private LinkedList<Race> raceList;
    
    /**
     * creates a State object 
     */
    public State(LinkedList<Race> raceList, String stateName)
    {
        this.raceList = raceList;
        this.stateName = stateName;
    }
    
    @Override
    public String toString()
    {
        
    }
    
    public boolean equals()
    {
        
    }
    
    public String getStateName()
    {
        return this.stateName;
    }
    
    public LinkedList<Race> callSort()
    {
        
    }

}
