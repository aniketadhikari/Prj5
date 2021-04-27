package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DataReader utilizes .csv file to create States in which COVID effects on
 * specific races are measured
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 */
public class DataReader {

    private LinkedList<State> stateList;

    /**
     * Builds DataReader
     * 
     * @param fileName
     *            name of file
     * @throws FileNotFoundException
     *             if file cannot be found
     */
    public DataReader(String fileName) throws FileNotFoundException {

        stateList = new LinkedList<State>();
        stateList = readDataFile(fileName);
        new GUIWindow(stateList);
    }


    /**
     * Returns linkedlist of states
     * 
     * @return state linkedlist
     */
    public LinkedList<State> getState() {
        return stateList;
    }


    /**
     * Helper method to read .csv file passed into the constructor
     * 
     * @param fileName
     *            name of file
     * @return linkedlist of states
     */
    @SuppressWarnings("unused")
    private LinkedList<State> readDataFile(String fileName)
        throws FileNotFoundException {

        File input = new File(fileName);
        Scanner scan = new Scanner(input);

        // to ignore first line
        scan.nextLine();

        while (scan.hasNext()) {
            String[] parsedLine = scan.nextLine().split(", *");

            int[] data = new int[parsedLine.length];

            // parsing the data
            for (int j = 1; j < parsedLine.length; j++) {
                if (parsedLine[j].equals("NA")) {
                    data[j] = -1;
                }
                else {
                    data[j] = Integer.valueOf(parsedLine[j]);
                }
            }
            Race white = new Race("white", data[6], data[1]);
            Race black = new Race("black", data[7], data[2]);
            Race latinx = new Race("latinx", data[8], data[3]);
            Race asian = new Race("asian", data[9], data[4]);
            Race other = new Race("other", data[10], data[5]);

            LinkedList<Race> races = new LinkedList<Race>();

            races.add(white);
            races.add(black);
            races.add(latinx);
            races.add(asian);
            races.add(other);
            String stateName = parsedLine[0];
            State currState = new State(races, stateName);
            stateList.add(currState);
        }
        scan.close();
        return stateList;
    }
}
