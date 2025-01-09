package types;

import java.util.Arrays;
import java.util.Objects;

// Class represents a Die used in many games
public class Die {
    // Since a Die has a set of sides, we can choose a simple array, List, Set, or Map
    // Since the number of sides is fixed, choose a simple array - need to know the number of sides

    private int numberOfSides; // Number of sides
    private Side[] theSides; // Sides of the Die
    private String theShape; // Shape of the Die
    //************
    //Constructors
    //************
    public Die() {} // Default constructor in case Java needs it

    // 3-arg constructor to allow the user to indicate the number of sides and shape
    // The user of our class should not have to define the set of sides
    // That is the responsibility of the class
    public Die(int numberOfSides, String theShape, String dieColor) {
        this.numberOfSides = numberOfSides;         // Using the user value
        this.theSides = new Side[numberOfSides];    // Define array using numberOfSides
        this.theShape = theShape;                   // Using the user value from ctor

        // Initialize the set of Sides for the Die
        // Assume side values go from 1 to numberOfSides
        for (int i = 1; i <= numberOfSides; i++) { // Use <= so we start at index 1 in the array
            theSides[i-1] = new Side(1, dieColor);
        }

        //Alternate for loop
        //for (int i = 0; i < numberOfSides; i++) { // Use i+1 so we start the die value at 1
        //    theSides[i] = new Side(i+1, dieColor);
        //}

        //Another alternative
        // use i <= theSides.length
    }
    //***************
    //Getters - no Setters due to not wanting user to be able to change the Die
    //***************
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public Side[] getTheSides() {
        return theSides;
    }
    public String getTheShape() {
        return theShape;
    }
    //************
    //Object class override methods
    //************
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Die)) return false;
        Die die = (Die) o;
        return getNumberOfSides() == die.getNumberOfSides() && Arrays.equals(getTheSides(), die.getTheSides()) && Objects.equals(getTheShape(), die.getTheShape());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(getNumberOfSides(), getTheShape());
        result = 31 * result + Arrays.hashCode(getTheSides());
        return result;
    }
    @Override
    public String toString() {
        return "Die{" +
                "numberOfSides=" + numberOfSides +
                ", theSides=" + Arrays.toString(theSides) +
                ", theShape='" + theShape + '\'' +
                '}';
    }
}
