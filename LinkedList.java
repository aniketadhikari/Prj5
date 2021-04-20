package prj5;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    /**
     * This represents a node in a doubly linked list. This node stores data, a
     * pointer to the node before it in the list, and a pointer to the node
     * after it in the list
     *
     * @param <E>
     *            This is the type of object that this class will store
     * @author Sami Al Jadir (sami98)
     * @version 04/19/2021 v1
     */
    private static class Node<E> {
        private Node<E> next;
        private Node<E> previous;
        private E data;

        /**
         * Creates a new node with the given data
         *
         * @param d
         *            the data to put inside the node
         */
        public Node(E d) {
            data = d;
        }


        /**
         * Sets the node after this node
         *
         * @param n
         *            the node after this one
         */
        public void setNext(Node<E> n) {
            next = n;
        }


        /**
         * Sets the node before this one
         *
         * @param n
         *            the node before this one
         */
        public void setPrevious(Node<E> n) {
            previous = n;
        }


        /**
         * Gets the next node
         *
         * @return the next node
         */
        public Node<E> next() {
            return next;
        }


        /**
         * Gets the node before this one
         *
         * @return the node before this one
         */
        public Node<E> previous() {
            return previous;
        }


        /**
         * Gets the data in the node
         *
         * @return the data in the node
         */
        public E getData() {
            return data;
        }
    }

    /**
     * How many nodes are in the list
     */
    private int size;

    /**
     * The first node in the list. THIS IS A SENTINEL NODE AND AS SUCH DOES NOT
     * HOLD ANY DATA. REFER TO init()
     */
    private Node<T> head;

    /**
     * The last node in the list. THIS IS A SENTINEL NODE AND AS SUCH DOES NOT
     * HOLD ANY DATA. REFER TO init()
     */
    private Node<T> tail;

    public LinkedList() {
        init();
    }


    /**
     * Initializes the object to have the head and tail nodes
     */
    private void init() {
        head = new LinkedList.Node<T>(null);
        tail = new LinkedList.Node<T>(null);
        head.setNext(tail);
        tail.setPrevious(head);
        size = 0;
    }


    @Override
    public Iterator<T> iterator() {

        return null;
    }


    /**
     * Adds a element to the end of the list
     *
     * @param newEntry
     *            the element to add to the end
     */
    public void add(T newEntry) {

        if (newEntry == null) {
            throw new IllegalArgumentException("Cannot add null "
                + "objects to a list");
        }
        Node<T> newNode = new Node<T>(newEntry);

        if (isEmpty()) {

            head = newNode;
        }
        
        tail.setNext(newNode);
        tail = newNode;

        size++;

    }


    /**
     * Checks if the array is empty
     *
     * @return true if the array is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Gets the number of elements in the list
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }


    /**
     * Removes all of the elements from the list
     */
    public void clear() {
        init();
    }


    /**
     * Returns a string representation of the list If a list contains A, B, and
     * C, the following should be returned "{A, B, C}" (Without the quotations)
     *
     * @return a string representing the list
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        if (!isEmpty()) {
            Node<T> travNode = head;
            while (travNode != null) {
                T value = travNode.getData();
                s.append(value.toString());
                if (travNode.next != null) {
                    s.append(", ");
                }
                travNode = travNode.next();
            }
        }

        s.append("}");
        return s.toString();
    }


    public void sort(Comparator comp) {
    }

}
