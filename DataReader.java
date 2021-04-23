
import java.awt.Taskbar.State;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import bsh.ParseException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author Jenny Tran
 * @version 2021.04.22
 */
public class DataReader {

    private State[] states;
    

    /**
     * 
     * @param fileName
     */
    public DataReader(String fileName) {

    }

    public

    /**
     * 
     * @param file
     * @return
     */
    private LinkedList<State> readDataFile(String fileName)   {
        LinkedList<State> stateList = new LinkedList<State>();
        
        File input = new File(fileName);
        Scanner scan;
        
        try
        {
            scan = new Scanner(input);
            scan.nextLine();
            
            for(int i = 0; scan.hasNext();i++)
            {
                String[] parsedLine = scan.nextLine().split(",");
                
                int[] data = new int[11];
                
                //parsing the data
                for(int j = 1; j < parsedLine.length; j++)
                {
                    if(parsedLine[j].equals("NA"))
                    {
                        data[j] = -1;
                    }
                    else
                    {
                        data[j] = Integer.valueOf(parsedLine[j]);
                    }
                }
                
                /**
                 * stateList.add(new State(parsedLine[0]));
                stateList.getEntry(i).add(new Race("white", numbers[6],
                    numbers[1]));
                stateList.getEntry(i).add(new Race("black", numbers[7],
                    numbers[2]));
                stateList.getEntry(i).add(new Race("latinX", numbers[8],
                    numbers[3]));
                stateList.getEntry(i).add(new Race("asian", numbers[9],
                    numbers[4])); 
                stateList.getEntry(i).add(new Race("other", numbers[10],
                    numbers[5]));
                 */
            }
            scan.close();          
        }
        catch(FileNotFoundException e)
        {
            System.out.print("File not Found");
        }
        return stateList;
    }
}
