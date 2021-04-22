package prj5;
/**
 * 
 * **
 * 
 * @author Aniket Adhikari
 * @version 04.22.2021 v1
 *
 * @param <T> 
 */
public class CompareCFR<T> implements Comparator<T> {

    /**
     * @param obj1
     * @param obj2
     * @return 
     */
    @Override
    public int compare(T obj1, T obj2) 
    {
        Race race1 = (Race)obj1;
        Race race2 = (Race)obj2;
        double r1CFR = (double) race1.getNumDeath() / race1.getNumPositive();
        double r2CFR = (double) race2.getNumDeath() / race2.getNumPositive();
        if (r1CFR == r2CFR)
        {
            return 0;
        }
        if (r1CFR < r2CFR)
        {
            return -1;
        }
        return 1;
    }

}
