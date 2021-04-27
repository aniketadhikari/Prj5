package prj5;

import java.util.Iterator;

/**
 * 
 * 
 * The state in which we are measuring the affects
 * COVID has had on different segments of the
 * population.
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 *
 */
public class State {

    private String stateName;
    private LinkedList<Race> raceList;

    /**
     * creates a State object
     * 
     * @param raceList
     *            linkedlist of race
     * @param stateName
     *            name of state
     */
    public State(LinkedList<Race> raceList, String stateName) {
        this.raceList = raceList;
        this.stateName = stateName;
    }


    /**
     * returns the demographic breakdown of the State
     * in a String format including the names of the
     * races and the CRF for each
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(stateName + "\n");
        LinkedList<Race> alphaSorted = this.callSortAlpha();

        Iterator<Race> alphaIter = alphaSorted.iterator();
        while (alphaIter.hasNext()) {
            sb.append(alphaIter.next() + " \n");
        }
        sb.append("===== \n");
        LinkedList<Race> cfrSorted = this.callSortCFR();
        Iterator<Race> cfrIter = cfrSorted.iterator();
        while (cfrIter.hasNext()) {
            sb.append(cfrIter.next() + " \n");
        }
        return sb.toString();

    }


    /**
     * getter method for the name of the state
     * 
     * @return the name of the state
     */
    public String getStateName() {
        return this.stateName;
    }


    /**
     * calls the sort method from the LinkedList class
     * and sorts the races by alphabetical order (A-Z)
     * 
     * @return the LinkedList sorted alphabetically
     */
    public LinkedList<Race> callSortAlpha() {
        raceList.sort(new CompareAlpha<Race>());
        return raceList;

    }


    /**
     * calls the sort method from the LinkedList class
     * and sorts the races by CFR (descending)
     * 
     * @return the LinkedList sorted by CFR
     */
    public LinkedList<Race> callSortCFR() {
        raceList.sort(new CompareCFR<Race>());
        return raceList;
    }


    /**
     * getter method for the linked list of races
     * 
     * @return list of races in the state
     */
    public LinkedList<Race> getRaceList() {
        return raceList;
    }

}
