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
     */
    public DataReader(String fileName) {
        races = new LinkedList<Race>();
        stateList = new LinkedList<State>();
    }


    /**
     * 
     * @param file
     * @return
     */
    private LinkedList<State> readDataFile(String fileName)
        throws FileNotFoundException {
        File input = new File(fileName);
        Scanner scan = new Scanner(input);
        scan.nextLine();
        for (int i = 0; scan.hasNext(); i++) {
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
            Race white = new Race("white", Integer.valueOf(parsedLine[6]),
                Integer.valueOf(parsedLine[1]));
            Race black = new Race("black", Integer.valueOf(parsedLine[7]),
                Integer.valueOf(parsedLine[2]));
            Race latinx = new Race("latinx", Integer.valueOf(parsedLine[8]),
                Integer.valueOf(parsedLine[3]));
            Race asian = new Race("asian", Integer.valueOf(parsedLine[9]),
                Integer.valueOf(parsedLine[4]));
            Race other = new Race("other", Integer.valueOf(parsedLine[10]),
                Integer.valueOf(parsedLine[5]));
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
