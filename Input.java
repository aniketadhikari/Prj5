/**
 * 
 */
package prj5;

import java.io.FileNotFoundException;

/**
 * @author 15407
 *
 */
public class Input {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        DataReader dR = new DataReader();

        dR.getLLState("Cases_and_Deaths_by_race_CRDT_Sep2020 (3).csv");
    }

}
