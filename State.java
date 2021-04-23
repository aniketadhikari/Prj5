package prj5;

import java.util.Iterator;

/**
 * 
 * @author Aniket Adhikari
 * @version 04.23.2021 
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
     * @param raceList
     */
    public State(LinkedList<Race> raceList, String stateName)
    {
        this.raceList = raceList;
        this.stateName = stateName;
    }
    
    /**
     * returns the demographic breakdown of the State
     * in a String format including the names of the 
     * races and the CRF for each
     */
    @Override
    public String toString()
    {
        Race asian = null;
        Race black = null;
        Race latinx = null;
        Race other = null;
        Race white = null;
        Iterator<Race> iterList = raceList.iterator();
        while (iterList.hasNext())
        {
            Race raceInQuestion = iterList.next();
            switch (raceInQuestion.getRace())
            {
                case "asian":
                    asian = raceInQuestion;
                    break;
                case "black":
                    black = raceInQuestion;
                    break;
                case "latinx":
                    latinx = raceInQuestion;
                    break;
                case "other":
                    other = raceInQuestion;
                    break;
                case "white":
                    white = raceInQuestion;
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(stateName + " \n");
        sb.append(asian.toString() + " \n");
        sb.append(black.toString() + " \n");
        sb.append(latinx.toString() + " \n");
        sb.append(other.toString() + " \n");
        sb.append(white.toString() + " \n");
        
        return sb.toString();
       
    }
    
    /**
     * getter method for the name of the state
     * @return the name of the state
     */
    public String getStateName()
    {
        return this.stateName;
    }
    
    /**
     * calls the sort method from the LinkedList class
     * and sorts the races by alphabetical order (A-Z)
     * @return the LinkedList sorted alphabetically
     */
    public LinkedList<Race> callSortAlpha()
    {
        raceList.sort(new CompareAlpha<Race>());
        return raceList;
        
    }
    
    /**
     * calls the sort method from the LinkedList class
     * and sorts the races by CFR (descending)
     * @return the LinkedList sorted by CFR 
     */
    public LinkedList<Race> callSortCFR()
    {
        raceList.sort(new CompareCFR<Race>());
        return raceList;
    }
    
    /**
     * getter method for the linked list of races
     * @return list of races in the state
     */
    public LinkedList<Race> getRaceList()
    {
        return raceList;
    }
    

}