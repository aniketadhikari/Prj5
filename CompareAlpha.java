package prj5;
/**
 * implements the comparator class by providing 
 * the user with a way of comparing the names 
 * of Race objects alphabetically
 * 
 * @author Aniket Adhikari
 * @version 04.23.2021 
 * 
 * @param <T> the type of objects that may be 
 *            compared by this comparator
 */
public class CompareAlpha<T> implements Comparator<T> {
    /**
     * 
     * @param obj1 is the object who's name is being compared
     *        alphabetically to obj2
     * @param obj2 is the object who's name is being compared 
     *        alphabetically to obj1
     * @return -1 if, alphabetically, the first object's name 
     *         comes before the second, 1 if the second object's 
     *         name comes before the first, and 0 if they have
     *         the same name
     */
    public int compare(T obj1, T obj2)
    {
        if (obj1 == null || obj2 == null)
        {
            throw new IllegalArgumentException("One of the parameters"
                + "has not been initialized");
        }
        Race race1 = (Race)obj1;
        Race race2 = (Race)obj2;
        String name1 = race1.getRace().toLowerCase();
        String name2 = race2.getRace().toLowerCase();
        int val = name1.compareToIgnoreCase(name2);
        // name1 comes after name2
        if (val > 0)
        {
            return 1; 
        }
        // name1 comes before name2
        else if (val < 0)
        {
            return -1;
        }
        // name is the same
        return 0;
        
        
        
    }
}
