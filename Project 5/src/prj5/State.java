package prj5;
/**
 * 
 * @author Aniket Adhikari
 * @version 04.19.2021 v2
 * 
 * The state in which we are measuring the affects 
 * COVID has had on different segments of the 
 * population. 
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
    
    /**
     * @return
     */
    @Override
    public String toString()
    {
        
    }
    
    
    public boolean equals(Object obj)
    {
        
    }
    
    /**
     * 
     * @return
     */
    public String getStateName()
    {
        return this.stateName;
    }
    
    /**
     * 
     * @return
     */
    public LinkedList<Race> callSort()
    {
        
    }

}
