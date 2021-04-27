package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 
 * a data structure that contains many objects
 * of the same type, where objects can be added,
 * sorted, and completely cleared from the list itself.
 * Each item is linked to each other through nodes
 * 
 * @author Aniket Adhikari
 * @version 04.23.2021
 * 
 * @param <T>
 *            the type of elements stored in the linked
 *            list data structure
 */
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
         * Gets the next node
         *
         * @return the next node
         */
        public Node<E> next() {
            return next;
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
        size = 0;

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


    /**
     * 
     * @param comp
     * @return
     */
    public void sort(Comparator<T> comp) {
        if (size > 1) {
            Node<T> unsortedPart = head.next();
            Node<T> sortedPart = head;
            sortedPart.setNext(null);

            while (unsortedPart != null) {
                Node<T> nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.next();
                insertInOrder(nodeToInsert, comp);
            }
        }
    }


    private void insertInOrder(Node<T> nodeToInsert, Comparator<T> comp) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while ((currentNode != null) && comp.compare(currentNode.getData(),
            nodeToInsert.getData()) < 0) {
            previousNode = currentNode;
            currentNode = currentNode.next();
        }

        if (previousNode != null) {
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setNext(currentNode);
        }
        else {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }
    }


    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if no node at the given index
     */

    public T getEntry(int index) {
        Node<T> current = head;
        int currentIndex = 0;
        T data = null;
        while (current != null) {
            if (currentIndex == index) {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }

        // check if the data was null...
        if (data == null) {
            // ... if so throw an exception
            throw new IndexOutOfBoundsException("Index exceeds the size.");
        }
        return data;
    }


    /**
     * Iterator method creates Iterator object
     *
     * @return new Iterator object
     */
    public Iterator<T> iterator() {

        return new LinkedListIterator<T>();
    }

    /**
     * 
     * @author Aniket Adhikari
     *
     * @param <A>
     *            the type of elements returned by this
     *            iterator
     */
    private class LinkedListIterator<A> implements Iterator<T> {

        private Node<T> curr;

        /**
         * creates a LinkedListIterator
         */
        public LinkedListIterator() {
            curr = head;
        }


        /**
         * determines whether the iteration has more
         * nodes in the linked list
         */
        @Override
        public boolean hasNext() {
            return curr != null;
        }


        /**
         * returns the next node in the linked list
         * iteration
         * 
         * @return the next node in the iteration
         */
        @Override
        public T next() {

            if (hasNext()) {
                Node<T> temp = curr;

                curr = curr.next;

                return temp.data;
            }
            else {
                throw new NoSuchElementException();

            }
        }

    }

}
