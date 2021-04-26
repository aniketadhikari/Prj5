package prj5;

/**
 * An interface that is used to order certain objects
 * of our classes by comparing two objects
 * 
 * @author Aniket Adhikari
 * @version 04.23.2021
 * 
 * @param <T>
 *            the type of objects that may be
 *            compared by this comparator
 */
public interface Comparator<T> {

    /**
     * compares the arguments for order
     * 
     * @param obj1
     *            object being compared to obj2
     * @param obj2
     *            object being compared to obj1
     * @return -1 if obj1 is less than obj2, 0 if
     *         they are equal to one another, and
     *         1 if obj1 is more than obj2
     */
    public int compare(T obj1, T obj2);
}
