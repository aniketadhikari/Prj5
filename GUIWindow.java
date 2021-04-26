package prj5;
import java.awt.Color;
import cs2.Button;
import cs2.CircleShape;
import cs2.Shape;
import cs2.TextShape;
import cs2.Window;
import cs2.WindowSide;

/**
 * 
 * @author Aniket Adhikari
 * @version 04.26.2021
 *
 */
public class GUIWindow {
    private Window window;
    private Button alphaSort;
    private Button cfrSort;
    private Button quit;
    private Button dcStats; 
    private Button gaStats;
    private Button mdStats;
    private Button ncStats;
    private Button tnStats;
    private Button vaStats;
    private LinkedList<State> stateList;
    private DataReader reader;
    private int width;
    private int height;
    
    /**
     * 
     */
    public GUIWindow()
    {
        // create alpha sort
        window = new Window("COVID Project");
        alphaSort = new Button("Sort by Alpha");
        alphaSort.onClick(this, "clickedSortAlpha");
        // create quit 
        window.addButton(alphaSort, WindowSide.NORTH);
        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");
        window.addButton(quit, WindowSide.NORTH);
        // create CFR sort
        cfrSort = new Button("Sort by CFR");
        cfrSort.onClick(this, "clickedSortCFR");
        window.addButton(cfrSort, WindowSide.NORTH);
        // create DC
        dcStats = new Button("Represent DC");
        dcStats.onClick(this, "clickedDC");
        window.addButton(dcStats, WindowSide.SOUTH);
        // create GA
        gaStats = new Button("Represent GA");
        gaStats.onClick(this, "clickedGA");
        window.addButton(gaStats, WindowSide.SOUTH);
        // create MD
        mdStats = new Button("Represent MD");
        mdStats.onClick(this, "clickedMD");
        window.addButton(mdStats, WindowSide.SOUTH);
        // create NC
        ncStats = new Button("Represent NC");
        ncStats.onClick(this, "clickedNC");
        window.addButton(ncStats, WindowSide.SOUTH);
        // create TN
        tnStats = new Button("Represent TN");
        tnStats.onClick(this, "clickedTN");
        window.addButton(tnStats, WindowSide.SOUTH);
        // create VA
        vaStats = new Button("Represent VA");
        vaStats.onClick(this, "clickedVA");
        window.addButton(vaStats, WindowSide.SOUTH);
    }
    
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
    
    public void clickedSortAlpha(Button sort)
    {
        
    }
    
    public void clickedSortCFR(Button sort)
    {
        
    }
    
    public void clickedDC(Button dc)
    {
        
    }
    
    public void clickedGA(Button dc)
    {
        
    }
    
    public void clickedMD(Button dc)
    {
        
    }
    
    public void clickedNC(Button dc)
    {
        
    }
    
    public void clickedTN(Button dc)
    {
        
    }
    
    public void clickedVA(Button dc)
    {
        
    }
    
    public void update()
    {
        
    }
    
    
    
    
}
