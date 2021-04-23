package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Jenny Tran
 * @version 2021.04.23 v2
 */
public class DataReader {

    private LinkedList<Race> races;
    private LinkedList<State> stateList;

    /**
     * 
     * @param fileName
     * @throws FileNotFoundException
     */
    public DataReader() throws FileNotFoundException {
        races = new LinkedList<Race>();
        stateList = new LinkedList<State>();

    }


    public LinkedList<State> getLLState(String fileName)
        throws FileNotFoundException {
        return readDataFile(fileName);
    }


    /**
     * 
     * @param file
     * @return
     */
    @SuppressWarnings("unused")
    private LinkedList<State> readDataFile(String fileName)
        throws FileNotFoundException {
        File input = new File(fileName);
        Scanner scan = new Scanner(input);

        // to ignore first line
        scan.nextLine();

        for (int i = 0; scan.hasNextLine(); i++) {
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
