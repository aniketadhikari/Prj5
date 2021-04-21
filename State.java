package prj5;
/**
 * 
 * @author Aniket Adhikari
 * @version 04.19.2021 v3
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
        StringBuilder sb = new StringBuilder();
        sb.append(stateName + "\n");
        sb.append("asian: \n");
        sb.append("black: \n");
        sb.append("latinx: \n");
        sb.append("other: \n");
        sb.append("white: \n");
        return sb.toString();
    }
    
    public boolean equals()
    {
        return false;
        
    }
    
    /**
     * 
     * @return
     */
    public String getStateName()
    {
        return this.stateName;
    }
    
    public LinkedList<Race> callSort()
    {
        return raceList;
        
    }

}
