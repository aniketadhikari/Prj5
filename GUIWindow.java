package prj5;

import java.awt.Color;
import java.util.Iterator;
import cs2.Button;
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
    private final static int WIDTH = 500;
    private final static int HEIGHT = 500;
    private final static int HISTOGRAM_WIDTH = 40;
    private final static int HEIGHT_FACTOR = 20;
    private final static int Y_BASE = 300;
    private final static int CFR_BOX = 350;
    private final static int RACE_BOX = 320;
    private State currentState;
    private Shape[] shapes;
    private TextShape[] textRace;
    private TextShape[] textCFR;

    /**
     * Creates a GUI Window consisting of sorting buttons,
     * a quit button, and buttons to view COVID statistics for
     * each state
     */
    public GUIWindow(LinkedList<State> stateList) {

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

        // Shape array
        shapes = new Shape[5];

        // Instantiate the stateList
        this.stateList = stateList;

        // set currentState to null
        currentState = null;

        textRace = new TextShape[5];
        textCFR = new TextShape[5];

    }


    public void clickedQuit(Button button) {
        System.exit(0);
    }


    public void clickedSortAlpha(Button sort) {

        currentState.callSortAlpha();
        createHistogram(currentState.getRaceList());
    }


    public void clickedSortCFR(Button sort) {

        currentState.callSortCFR();
        createHistogram(currentState.getRaceList());
    }


    /**
     * 
     * @param button
     */
    public void clickedDC(Button button) {
        State dc = stateList.getEntry(0);
        currentState = dc;
        createHistogram(dc.getRaceList());
    }


    /**
     * Displays Georgia's COVID data
     * 
     * @param button
     */
    public void clickedGA(Button button) {
        State ga = stateList.getEntry(1);
        currentState = ga;
        createHistogram(ga.getRaceList());

    }


    /**
     * Displays Maryland's COVID data
     * 
     * @param button
     */
    public void clickedMD(Button button) {
        State md = stateList.getEntry(2);
        currentState = md;
        createHistogram(md.getRaceList());
    }


    /**
     * Displays North Carolina's COVID data
     * 
     * @param button
     */
    public void clickedNC(Button button) {
        State nc = stateList.getEntry(3);
        currentState = nc;
        createHistogram(nc.getRaceList());
    }


    /**
     * Displays Tennessee's COVID data
     * 
     * @param button
     */
    public void clickedTN(Button button) {
        State tn = stateList.getEntry(4);
        currentState = tn;
        createHistogram(tn.getRaceList());
    }


    /**
     * Displays Virginia's COVID data
     * 
     * @param button
     */
    public void clickedVA(Button dc) {
        State va = stateList.getEntry(5);
        currentState = va;
        createHistogram(va.getRaceList());
    }


    public void createHistogram(LinkedList<Race> raceList) {

        // remove current data from the screen

        Iterator<Race> iter = raceList.iterator();
        for (int i = 0; i < shapes.length; i++)

        {
            // removes the shape if it's already on the screen
            if (shapes[i] != null) {
                window.removeShape(shapes[i]);
                window.removeShape(textRace[i]);
                window.removeShape(textCFR[i]);
            }
            Race race = iter.next();
            // fills a race with no CFR value with an "NA"
            if (race.getCFR() == -1) {
                textRace[i] = new TextShape(0, GUIWindow.RACE_BOX, race
                    .getRace());
                textCFR[i] = new TextShape(0, GUIWindow.CFR_BOX, "NA");

                shapes[i] = new TextShape((window.getGraphPanelWidth() / 6) * (i
                    + 1), GUIWindow.Y_BASE - textCFR[i].getHeight(), "NA");
                shapes[i].setX((window.getGraphPanelWidth() / 6) * (i + 1)
                    - shapes[i].getWidth() / 2);

            }
            else {

                // Add textRace and textCFR HERE
                textRace[i] = new TextShape(0, GUIWindow.RACE_BOX, race
                    .getRace());

                textCFR[i] = new TextShape(0, GUIWindow.CFR_BOX, race
                    .getCFRFormatted() + "%");

                // create the histogram
                shapes[i] = new Shape((window.getGraphPanelWidth() / 6) * (i
                    + 1) - (GUIWindow.HISTOGRAM_WIDTH / 2), GUIWindow.Y_BASE
                        - (int)((race.getCFR() * GUIWindow.HEIGHT_FACTOR)),
                    GUIWindow.HISTOGRAM_WIDTH, (int)(race.getCFR()
                        * GUIWindow.HEIGHT_FACTOR), Color.BLUE);

            }
            textRace[i].setX((window.getGraphPanelWidth() / 6) * (i + 1)
                - textRace[i].getWidth() / 2);

            textCFR[i].setX((window.getGraphPanelWidth() / 6) * (i + 1)
                - textCFR[i].getWidth() / 2);

            window.addShape(shapes[i]);
            window.addShape(textRace[i]);
            window.addShape(textCFR[i]);

        }

    }
}
