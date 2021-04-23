
/**
 * 
 */
package prj5;

import student.TestCase;
import java.io.FileNotFoundException;
import java.util.Iterator;

/**
 * @author 15407
 *
 */
public class DataReaderTest extends TestCase {

    private DataReader dR;

    public void setUp() throws FileNotFoundException {
        dR = new DataReader("Cases_and_Deaths_by_race_CRDT_Sep2020.csv");
    }


    public void testreadDataFile() {
        LinkedList<State> states = dR.getState();
        Iterator<State> iter = states.iterator();

        assertEquals("DC", iter.next().getStateName());

        assertEquals(iter.next().toString(), "DC\r\n"
            + "asian: 5407 cases, 4.7% CFR\r\n"
            + "black: 179563 cases, 7.4% CFR\r\n"
            + "latinx: 97118 cases, 2.3% CFR\r\n"
            + "other: 108784 cases, 0.2% CFR\r\n"
            + "white: 70678 cases, 2.7% CFR\r\n" + "=====\r\n"
            + "black: 179563 cases, 7.4% CFR\r\n"
            + "asian: 5407 cases, 4.7% CFR\r\n"
            + "white: 70678 cases, 2.7% CFR\r\n"
            + "latinx: 97118 cases, 2.3% CFR\r\n"
            + "other: 108784 cases, 0.2% CFR\r\n" + "=====\r\n" + "GA\r\n"
            + "asian: 60426 cases, 3.1% CFR\r\n"
            + "black: 1199125 cases, 4.2% CFR\r\n"
            + "latinx: 601778 cases, 1% CFR\r\n"
            + "other: 1542083 cases, 0.1% CFR\r\n"
            + "white: 1122398 cases, 4.5% CFR\r\n" + "=====\r\n"
            + "white: 1122398 cases, 4.5% CFR\r\n"
            + "black: 1199125 cases, 4.2% CFR\r\n"
            + "asian: 60426 cases, 3.1% CFR\r\n"
            + "latinx: 601778 cases, 1% CFR\r\n"
            + "other: 1542083 cases, 0.1% CFR\r\n" + "=====\r\n" + "MD\r\n"
            + "asian: 47733 cases, 8.4% CFR\r\n"
            + "black: 764514 cases, 5.6% CFR\r\n"
            + "latinx: 635420 cases, 1.8% CFR\r\n"
            + "other: 539893 cases, 0.4% CFR\r\n"
            + "white: 534910 cases, 8.4% CFR\r\n" + "=====\r\n"
            + "asian: 47733 cases, 8.4% CFR\r\n"
            + "white: 534910 cases, 8.4% CFR\r\n"
            + "black: 764514 cases, 5.6% CFR\r\n"
            + "latinx: 635420 cases, 1.8% CFR\r\n"
            + "other: 539893 cases, 0.4% CFR\r\n" + "=====\r\n" + "NC\r\n"
            + "asian: 41305 cases, 1.8% CFR\r\n"
            + "black: 525056 cases, 3.2% CFR\r\n"
            + "latinx: 787616 cases, -1% CFR\r\n"
            + "other: 1192110 cases, 0.5% CFR\r\n"
            + "white: 1202651 cases, 2.5% CFR\r\n" + "=====\r\n"
            + "black: 525056 cases, 3.2% CFR\r\n"
            + "white: 1202651 cases, 2.5% CFR\r\n"
            + "asian: 41305 cases, 1.8% CFR\r\n"
            + "other: 1192110 cases, 0.5% CFR\r\n"
            + "latinx: 787616 cases, -1% CFR\r\n" + "=====\r\n" + "TN\r\n"
            + "asian: 25846 cases, 1.6% CFR\r\n"
            + "black: 491709 cases, 1.9% CFR\r\n"
            + "latinx: 443364 cases, -1% CFR\r\n"
            + "other: 847967 cases, 0.3% CFR\r\n"
            + "white: 1140754 cases, 1.5% CFR\r\n" + "=====\r\n"
            + "black: 491709 cases, 1.9% CFR\r\n"
            + "asian: 25846 cases, 1.6% CFR\r\n"
            + "white: 1140754 cases, 1.5% CFR\r\n"
            + "other: 847967 cases, 0.3% CFR\r\n"
            + "latinx: 443364 cases, -1% CFR\r\n" + "=====\r\n" + "VA\r\n"
            + "asian: -1 cases, -1% CFR\r\n"
            + "black: 426362 cases, 3.4% CFR\r\n"
            + "latinx: 738177 cases, -1% CFR\r\n"
            + "other: 777332 cases, 0.7% CFR\r\n"
            + "white: 616402 cases, 5.6% CFR\r\n" + "=====\r\n"
            + "white: 616402 cases, 5.6% CFR\r\n"
            + "black: 426362 cases, 3.4% CFR\r\n"
            + "other: 777332 cases, 0.7% CFR\r\n"
            + "asian: -1 cases, -1% CFR\r\n"
            + "latinx: 738177 cases, -1% CFR\r\n" + "=====\r\n" + "DC\r\n"
            + "asian: 55264 cases, 16.8% CFR\r\n"
            + "black: 38347 cases, 0.9% CFR\r\n"
            + "latinx: 29945 cases, 15.3% CFR\r\n"
            + "other: 68227 cases, 8.5% CFR\r\n"
            + "white: 85454 cases, 0.3% CFR\r\n" + "=====\r\n"
            + "asian: 55264 cases, 16.8% CFR\r\n"
            + "latinx: 29945 cases, 15.3% CFR\r\n"
            + "other: 68227 cases, 8.5% CFR\r\n"
            + "black: 38347 cases, 0.9% CFR\r\n"
            + "white: 85454 cases, 0.3% CFR\r\n" + "=====\r\n" + "GA\r\n"
            + "asian: 55816 cases, 13.5% CFR\r\n"
            + "black: 30341 cases, 9.6% CFR\r\n"
            + "latinx: 11740 cases, 81.8% CFR\r\n"
            + "other: 56230 cases, 15.1% CFR\r\n"
            + "white: 56845 cases, 3.6% CFR\r\n" + "=====\r\n"
            + "latinx: 11740 cases, 81.8% CFR\r\n"
            + "other: 56230 cases, 15.1% CFR\r\n"
            + "asian: 55816 cases, 13.5% CFR\r\n"
            + "black: 30341 cases, 9.6% CFR\r\n"
            + "white: 56845 cases, 3.6% CFR\r\n" + "=====\r\n" + "MD\r\n"
            + "asian: 62800 cases, 14.5% CFR\r\n"
            + "black: 24422 cases, 30.4% CFR\r\n"
            + "latinx: 35777 cases, 1.9% CFR\r\n"
            + "other: 16290 cases, 38.6% CFR\r\n"
            + "white: 92158 cases, 0.5% CFR\r\n" + "=====\r\n"
            + "other: 16290 cases, 38.6% CFR\r\n"
            + "black: 24422 cases, 30.4% CFR\r\n"
            + "asian: 62800 cases, 14.5% CFR\r\n"
            + "latinx: 35777 cases, 1.9% CFR\r\n"
            + "white: 92158 cases, 0.5% CFR\r\n" + "=====\r\n" + "NC\r\n"
            + "asian: 80950 cases, 2.7% CFR\r\n"
            + "black: 29158 cases, 0.9% CFR\r\n"
            + "latinx: 55944 cases, 8.8% CFR\r\n"
            + "other: 58937 cases, 2.4% CFR\r\n"
            + "white: 78457 cases, 11.5% CFR\r\n" + "=====\r\n"
            + "white: 78457 cases, 11.5% CFR\r\n"
            + "latinx: 55944 cases, 8.8% CFR\r\n"
            + "asian: 80950 cases, 2.7% CFR\r\n"
            + "other: 58937 cases, 2.4% CFR\r\n"
            + "black: 29158 cases, 0.9% CFR\r\n" + "=====\r\n" + "TN\r\n"
            + "asian: 31972 cases, 8.4% CFR\r\n"
            + "black: 72620 cases, 10.6% CFR\r\n"
            + "latinx: 37223 cases, 4.3% CFR\r\n"
            + "other: 36822 cases, 5.8% CFR\r\n"
            + "white: 10350 cases, 52.7% CFR\r\n" + "=====\r\n"
            + "white: 10350 cases, 52.7% CFR\r\n"
            + "black: 72620 cases, 10.6% CFR\r\n"
            + "asian: 31972 cases, 8.4% CFR\r\n"
            + "other: 36822 cases, 5.8% CFR\r\n"
            + "latinx: 37223 cases, 4.3% CFR\r\n" + "=====\r\n" + "VA\r\n"
            + "asian: 37276 cases, 10.7% CFR\r\n"
            + "black: 17344 cases, 56.6% CFR\r\n"
            + "latinx: 36689 cases, 25% CFR\r\n"
            + "other: 60088 cases, 1.2% CFR\r\n"
            + "white: 85505 cases, 9.7% CFR\r\n" + "=====\r\n"
            + "black: 17344 cases, 56.6% CFR\r\n"
            + "latinx: 36689 cases, 25% CFR\r\n"
            + "asian: 37276 cases, 10.7% CFR\r\n"
            + "white: 85505 cases, 9.7% CFR\r\n"
            + "other: 60088 cases, 1.2% CFR\r\n" + "=====");
    }
}
