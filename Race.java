/**
 * 
 * @author Jenny Tran
 * @version 2021.04.20
 */
public class Race {
    private String raceName;
    private int numDeath;
    private int numPositive;

    /**
     * 
     * @param name
     * @param numDeath
     * @param numPositive
     */
    public Race(String name, int numDeath, int numPositive) {
        raceName = name;
        this.numDeath = numDeath;
        this.numPositive = numPositive;
    }


    /**
     * 
     * @return
     */
    public String getRace() {
        return raceName;
    }


    /**
     * 
     * @return
     */
    public int getNumDeath() {
        return numDeath;
    }


    /**
     * 
     * @return
     */
    public int getNumPositive() {
        return numPositive;
    }


    /**
     * 
     * @return
     */
    public double getCFR() {
        return (numDeath / numPositive) * 100;
    }


    /**
     * 
     * @param other
     * @return
     */
    public boolean equals(Race other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (other.getRace().equals(raceName) && other.getNumDeath() == numDeath
            && other.getNumPositive() == numPositive) {
            return true;
        }
        return false;
    }
}
