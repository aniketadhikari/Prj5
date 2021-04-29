/**
 * 
 */
package prj5;

import java.io.FileNotFoundException;
import java.util.Iterator;

/**
 * Project runner to read the file input and create
 * the window for the data 
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
            dR = new DataReader("Cases_and_Deaths_CRDT_NEW.csv");

        }
    }

}
