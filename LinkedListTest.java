package prj5;

import student.TestCase;

public class LinkedListTest extends TestCase {

    private LinkedList<String> l1;
    private LinkedList<String> l2;
    private LinkedList<String> l3;

    public void setUp() {
        l1 = new LinkedList<String>();
        l2 = new LinkedList<String>();
        l3 = new LinkedList<String>();
    }


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

        l1.add("friends");
        assertEquals(l1.size(), 1);

        assertEquals(l1.toString(), "{friends}");

        // test adding second item

        l1.add("more friends");
        assertEquals(l1.size(), 2);

        assertEquals(l1.toString(), "{friends, more friends}");

    }


    public void testIsEmpty() {
        assertTrue(l1.isEmpty());
    }


    public void testSize() {
        assertEquals(l1.size(), 0);
    }


    public void testClear() {
        l1.add("friends");
        assertEquals(l1.toString(), "{friends}");

        l1.clear();

        assertEquals(l1.toString(), "{}");
        assertTrue(l1.isEmpty());
    }


    public void testSort() {

    }
}
