package prj5;

/**
 * implements the comparator class by providing
 * the user with a way of comparing the names
 * of Race objects alphabetically
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 * 
 * @param <T>
 *            the type of objects that may be
 *            compared by this comparator
 */
public class CompareAlpha<T> implements Comparator<Race> {
    /**
     * comparing method for races which compares the
     * name of races
     * 
     * @param race1
     *            is the race object who's name is being compared
     *            alphabetically to race2
     * @param race2
     *            is the race object who's name is being compared
     *            alphabetically to race2
     * @return -1 if, alphabetically, the first race's name
     *         comes before the second, 1 if the second race's
     *         name comes before the first, and 0 if they have
     *         the same name
     */
    public int compare(Race race1, Race race2) {
        if (race1 == null || race2 == null) {
            throw new IllegalArgumentException("One of the parameters"
                + "has not been initialized");
        }
        String name1 = race1.getRace().toLowerCase();
        String name2 = race2.getRace().toLowerCase();
        int val = name1.compareToIgnoreCase(name2);
        if (val > 0) {
            return 1;
        }
        else if (val < 0) {
            return -1;
        }
        return 0;

    }
}
