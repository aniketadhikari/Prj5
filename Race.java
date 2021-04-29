package prj5;

import java.text.DecimalFormat;

/**
 * This class represents the Race/Ethnicity within each state to calculate the
 * number of COVID-19 cases, number of COVID related deaths, and the CFR from
 * each group (white, black, latinX, asian, other)
 * 
 * @author Aniket Adhikari, Jenny Tran, Sami Al Jadir
 * @version 2021.04.27
 */
public class Race {
    private String raceName;
    private int numDeath;
    private int numPositive;

    /**
     * Builds new Race object with the name, number of COVID-19 deaths, and
     * number of COVID-19 positive cases
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
     * getter method for the name of the race
     * 
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
     * 
     * @return the CFR for the race
     */
    public double getCFR() {
        if (this.getNumDeath() == -1 || this.getNumPositive() == -1) {
            return -1.0;
        }
        double cfr = (double)this.getNumDeath() / this.getNumPositive() * 100;
        return cfr;
    }


    /**
     * Helper method to format CFR into a String
     * 
     * @return string of CFR
     */
    public String getCFRFormatted() {
        DecimalFormat df = new DecimalFormat("0.#");
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
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Race race = (Race)other;
        return (race.getRace().equals(raceName) && race
            .getNumDeath() == numDeath && race.getNumPositive() == numPositive);
    }


    /**
     * Converts race into the string format: "asian: 5407 cases, 4.7% CFR"
     * 
     * @return String format of Race
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.raceName);
        sb.append(": " + getNumPositive() + " cases, ");
        sb.append(getCFRFormatted() + "% CFR");
        return sb.toString();

    }
}
