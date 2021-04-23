package prj5;
import java.text.DecimalFormat;

/**
 * 
 * @author Jenny Tran
 * @version 04.23.2021
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
     * getter method for the name of the race
     * @return the name of the race in lower 
     *         case format
     */
    public String getRace() {
        return raceName.toLowerCase();
    }


    /**
     * getter method for people of a 
     * specific race who died from COVID-19
     * 
     * @return the number of people who died
     */
    public int getNumDeath() {
        return numDeath;
    }


    /**
     * getter method for the people of a specific
     * race who were infected with COVID-19
     * 
     * @return the number of people infected
     */
    public int getNumPositive() {
        return numPositive;
    }


    /**
     * determines the CFR (Case Fatality Ratio), 
     * which is equal to 
     * (# of deaths due to COVID / # of total cases) * 100
     * @return the CFR for the race 
     */
    public double getCFR() 
    {
        double cfr = (double) this.getNumDeath() / this.getNumPositive() * 100;
        return cfr;
    }
    
    public String getCFRFormatted()
    {
        DecimalFormat df = new DecimalFormat("0.0");
        double raceCFR = this.getCFR();
        String result = df.format(raceCFR);
        return result;
        
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
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.raceName);
        sb.append(": " + getNumPositive() + " cases, ");
        sb.append(getCFRFormatted() + "% CFR");
        return sb.toString();
        
    }
}
