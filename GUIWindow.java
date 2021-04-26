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
    private final static int WIDTH = 500;
    private final static int HEIGHT = 500;
    private final static int HISTOGRAM_SPACE = 10;
    private final static int HISTOGRAM_WIDTH = 10;
    private Shape asian;
    private Shape black;
    private Shape latinx;
    private Shape other;
    private Shape white;
    
    /**
     * Creates a GUI Window consisting of sorting buttons,
     * a quit button, and buttons to view COVID statistics for 
     * each state
     */
    public GUIWindow()
    {
        
        // create alpha sort
        window = new Window("COVID Project");
        window.setSize(WIDTH, HEIGHT);
        alphaSort = new Button("Sort by Alpha");
        alphaSort.onClick(this, "clickedSortAlpha");
        alphaSort.setForegroundColor(Color.blue);
        window.addButton(alphaSort, WindowSide.NORTH);
        // create quit 
        quit = new Button("Quit");
        quit.onClick(this, "clickedQuit");
        quit.setForegroundColor(Color.red);
        window.addButton(quit, WindowSide.NORTH);
        // create CFR sort
        cfrSort = new Button("Sort by CFR");
        cfrSort.onClick(this, "clickedSortCFR");
        cfrSort.setForegroundColor(Color.green);
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
    
    /**
     * 
     * @param button
     */
    public void clickedDC(Button button) {
        asian = new Shape(50, 50, HISTOGRAM_WIDTH, Color.BLUE);
        black = new Shape(asian.getX() + HISTOGRAM_SPACE, 300, HISTOGRAM_WIDTH, Color.BLUE);
        latinx = new Shape(black.getX() + HISTOGRAM_SPACE, 300, HISTOGRAM_WIDTH, Color.BLUE);
        other = new Shape(latinx.getX() + HISTOGRAM_SPACE, 300, HISTOGRAM_WIDTH, Color.BLUE);
        white = new Shape(other.getX() + HISTOGRAM_SPACE, 300, HISTOGRAM_WIDTH, Color.BLUE);
        window.addShape(asian);
        window.addShape(black);
        window.addShape(latinx);
        window.addShape(other);
        window.addShape(white);
    }
    
    /**
     * Displays Georgia's COVID data
     * @param button
     */
    public void clickedGA(Button button)
    {
        State ga = stateList.getEntry(1);
        update(ga);
    }
    
    /**
     * Displays Maryland's COVID data
     * @param button
     */
    public void clickedMD(Button button)
    {
        State md = stateList.getEntry(2);
        update(md);
    }
    
    /**
     * Displays North Carolina's COVID data
     * @param button
     */
    public void clickedNC(Button button)
    {
        State nc = stateList.getEntry(3);
        update(nc);
    }
    
    /**
     * Displays Tennessee's COVID data
     * @param button
     */
    public void clickedTN(Button button)
    {
        State tn = stateList.getEntry(4);
        update(tn);
    }
    
    public void clickedVA(Button dc)
    {
        State va = stateList.getEntry(5);
        update(va);
    }
    
    public void update(State state)
    {
        
    }
    
}
