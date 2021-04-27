package prj5;

import java.io.FileNotFoundException;

/**
 * Project Runner
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 */
public class Input {

    /**
     * Main method to run the project
     * 
     * @param args
     *            the file passed in
     * @throws FileNotFoundException
     *             if file cannot be found
     */
    public static void main(String[] args) throws FileNotFoundException {

        DataReader dR;
        if (args.length > 0) {
            dR = new DataReader(args[0]);
        }
        else {
            dR = new DataReader("Cases_and_Deaths_by_race_RANDOM_NUMBERS.csv");

        }
// LinkedList<State> states = dR.getState();
//
// Iterator<State> statesIter = states.iterator();
// while (statesIter.hasNext()) {
//
// System.out.println(statesIter.next().toString());
// }
    }

}
