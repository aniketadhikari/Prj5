package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import student.TestCase;

/**
 * Test class for LinkedList
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 */
public class LinkedListTest extends TestCase {

    private LinkedList<String> l1;

    private Iterator<String> iter;

    /**
     * Sets up test methods
     */
    public void setUp() {
        l1 = new LinkedList<String>();
        iter = l1.iterator();
    }


    /**
     * Tests add method
     */
    public void testAdd() {

        // test adding null string
        Exception e = null;
        String nothing = null;
        try {
            l1.add(nothing);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);

        // test adding one string
        assertEquals(l1.size(), 0);
        assertEquals(l1.toString(), "{}");

        l1.add("asian");
        assertEquals(l1.size(), 1);

        assertEquals(l1.toString(), "{asian}");

        // test adding second item

        l1.add("white");
        assertEquals(l1.size(), 2);

        assertEquals(l1.toString(), "{asian, white}");

    }


    /**
     * Tests if linked list is empty
     */
    public void testIsEmpty() {
        assertTrue(l1.isEmpty());
    }


    /**
     * Tests if size of linked list is returned
     */
    public void testSize() {
        assertEquals(l1.size(), 0);
    }


    /**
     * Tests if linkedlist has been cleared
     */
    public void testClear() {
        l1.add("friends");
        assertEquals(l1.toString(), "{friends}");

        l1.clear();

        assertEquals(l1.toString(), "{}");
        assertTrue(l1.isEmpty());
    }


    /**
     * Tests if iterable has next
     */
    public void testHasNext() {

        l1.add("A");
        assertTrue(iter.hasNext());

    }


    /**
     * Tests if iterable returns next
     */
    public void testNext() {
        l1 = new LinkedList<String>();

        l1.add("A");
        iter = l1.iterator();
        assertEquals(iter.next(), "A");

        l1 = new LinkedList<String>();
        Exception exception = null;
        try {
            iter.next();
        }
        catch (NoSuchElementException e) {
            exception = e;
        }

        assertTrue(exception instanceof NoSuchElementException);

    }


    /**
     * Tests sort method when there is an alpha comparator
     */
    public void testSortAlpha() {
        CompareAlpha<Race> raceCompare = new CompareAlpha<Race>();
        LinkedList<Race> races = new LinkedList<Race>();
        races.add(new Race("B", 250, 500));
        races.add(new Race("E", 300, 500));
        races.add(new Race("D", 200, 500));
        races.add(new Race("C", 100, 500));
        races.add(new Race("A", 150, 500));
        StringBuilder unsorted = new StringBuilder();
        unsorted.append("{B: 500 cases, 50% CFR, ");
        unsorted.append("E: 500 cases, 60% CFR, ");
        unsorted.append("D: 500 cases, 40% CFR, ");
        unsorted.append("C: 500 cases, 20% CFR, ");
        unsorted.append("A: 500 cases, 30% CFR}");
        assertEquals(races.toString(), unsorted.toString());
        StringBuilder sortedAlpha = new StringBuilder();
        sortedAlpha.append("{A: 500 cases, 30% CFR, ");
        sortedAlpha.append("B: 500 cases, 50% CFR, ");
        sortedAlpha.append("C: 500 cases, 20% CFR, ");
        sortedAlpha.append("D: 500 cases, 40% CFR, ");
        sortedAlpha.append("E: 500 cases, 60% CFR}");
        races.sort(raceCompare);
        assertEquals(races.toString(), sortedAlpha.toString());

        // when empty

        LinkedList<Race> races2 = new LinkedList<Race>();
        races2.sort(raceCompare);
        assertEquals(races2.toString(), "{}");

    }


    /**
     * Tests the sort method when there is a CFR comparator
     */
    public void testSortCFR() {
        LinkedList<Race> races = new LinkedList<Race>();
        races.add(new Race("B", 250, 500));
        races.add(new Race("E", 300, 500));
        races.add(new Race("D", 200, 500));
        races.add(new Race("C", 100, 500));
        races.add(new Race("A", 150, 500));

        CompareCFR<Race> raceCompare = new CompareCFR<Race>();
        StringBuilder unsorted = new StringBuilder();
        unsorted.append("{B: 500 cases, 50% CFR, ");
        unsorted.append("E: 500 cases, 60% CFR, ");
        unsorted.append("D: 500 cases, 40% CFR, ");
        unsorted.append("C: 500 cases, 20% CFR, ");
        unsorted.append("A: 500 cases, 30% CFR}");
        assertEquals(races.toString(), unsorted.toString());
        StringBuilder sortedCFR = new StringBuilder();
        sortedCFR.append("{E: 500 cases, 60% CFR, ");
        sortedCFR.append("B: 500 cases, 50% CFR, ");
        sortedCFR.append("D: 500 cases, 40% CFR, ");
        sortedCFR.append("A: 500 cases, 30% CFR, ");
        sortedCFR.append("C: 500 cases, 20% CFR}");
        races.sort(raceCompare);
        assertEquals(races.toString(), sortedCFR.toString());
    }

}
