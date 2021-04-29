package prj5;

/**
 * implements the comparator class by providing
 * the user with a way of comparing the CFR
 * of Race objects
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 *
 * @param <T>
 *            the type of objects that may be
 *            compared by this comparator
 */
public class CompareCFR<T> implements Comparator<T> {

    /**
     * comparing method for races which compares the 
     * CFR values of races 
     * 
     * @param obj1
     *            is the object who's CFR is being compared
     *            to obj2
     * @param obj2
     *            is the object who's CFR is being compared
     *            to obj1
     * @return -1 if the first object's CFR is less than the second
     *         object's CFR, 1 if the first object's
     *         CFR is more than the second object's CFR,
     *         and 0 if they have the same CFR
     */
    @Override
    public int compare(T obj1, T obj2) {
        if (obj1 == null || obj2 == null) {
            throw new IllegalArgumentException("One of the parameters"
                + "has not been initialized");
        }
        Race race1 = (Race)obj1;
        Race race2 = (Race)obj2;
        double r1CFR = race1.getCFR();
        double r2CFR = race2.getCFR();

        if (r1CFR == r2CFR) {
            return race1.getRace().compareToIgnoreCase(race2.getRace());
        }
        else if (r1CFR < r2CFR) {
            return 1;
        }
        return -1;
    }

}
