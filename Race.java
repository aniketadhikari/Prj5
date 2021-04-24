
import java.text.DecimalFormat;

/**
 * This class represents the Race/Ethnicity within each state to calculate the
 * number of COVID-19 cases, number of COVID related deaths, and the CFR from
 * each group (white, black, latinX, asian, other)
 * 
 * @author Jenny Tran
 * @version 2021.04.20
 */
public class Race {
    private String raceName;
    private int numDeath;
    private int numPositive;

    /**
     * Builds new Race object with the name, number of covid-19 deaths, and
     * number of covid-19 positive cases
     * 
     * @param name
     *            of race
     * @param numDeath
     *            specific to race
     * @param numPositive
     *            specific to race
     */
    public Race(String name, int numDeath, int numPositive) {
        raceName = name;
        this.numDeath = numDeath;
        this.numPositive = numPositive;
    }


    /**
     * Getter method for the name of race
     * 
     * @return the name of the race in lowercase format
     */
    public String getRace() {
        return raceName;
    }


    /**
     * Getter method for the number of COVID-19 deaths for a specific race
     * 
     * @return the number of people who died
     */
    public int getNumDeath() {
        return numDeath;
    }


    /**
     * Getter method for the number of COVID-19 positive cases for a specific
     * race
     * 
     * @return the number of positive cases
     */
    public int getNumPositive() {
        return numPositive;
    }


    /**
     * Determines the CFR (Case Fatality Ratio),
     * which is equal to
     * (# of deaths due to COVID / # of total cases) * 100
     * 
     * @return The CFR for the race
     */
    public double getCFR() {
        double cfr = (double)this.getNumDeath() / this.getNumPositive() * 100;
        return Math.round(cfr * 100.0) / 100.0;
    }


    /**
     * Helper method to format CFR into a String
     * 
     * @return string of CFR
     */
    public String getCFRFormatted() {
        DecimalFormat df = new DecimalFormat("0.0");
        double raceCFR = this.getCFR();
        String result = df.format(raceCFR);
        return result;

    }


    /**
     * Tests if this.race equals other race
     * 
     * @param other
     *            race to be compared to
     * @return true if equals, false otherwise
     */
    public boolean equals(Race other) {
        boolean b = false;
        if (this == other) {
            b = true;
        }
        if (other == null) {
            b = false;
        }
        if (this.getClass() != other.getClass()) {
            b = false;
        }
        if (other.getRace().equals(raceName) && other.getNumDeath() == numDeath
            && other.getNumPositive() == numPositive) {
            b = true;
        }
        return b;
    }


    /**
     * Converts race into the string format: "asian: 5407 cases, 4.7% CFR"
     * 
     * @return String format of Race
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(raceName + ": ");
        builder.append(numPositive + " cases, ");
        builder.append(getCFRFormatted() + "% CFR");
        return builder.toString();
    }

}
