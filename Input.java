package prj5;
import java.io.FileNotFoundException;

public class Input {

    public static void main(String[] strings) throws FileNotFoundException {
        
        if (strings.length == 1)
        {
            DataReader reader = new DataReader(strings[0]);
        }
        else
        {
            DataReader reader = new DataReader("Cases_and_Deaths_by_race_CRDT_Sep2020");
        }
    }

}
