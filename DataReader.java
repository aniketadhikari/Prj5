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
     * Builds a DataReader object, which reads through
     * the file passed in as the argument and created a
     * linked list of states
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
     * Getter method for the linked list of states
     * 
     * @return a linked list of states
     */
    public LinkedList<State> getState() {
        return stateList;
    }


    /**
     * Helper method to read .csv file passed into the constructor
     * 
     * @param fileName
     *            name of file
     * @return linked list of states that were created
     *         from the file passed in as the argument
     */
    private LinkedList<State> readDataFile(String fileName)
        throws FileNotFoundException {
        File input = new File(fileName);
        Scanner scan = new Scanner(input);
        scan.nextLine();
        while (scan.hasNext()) {
            String[] parsedLine = scan.nextLine().split(", *");
            int[] data = new int[parsedLine.length];
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
