package types;

import java.util.Objects;

// Represents the side of a Die object
public class Side {
    private int sideValue; // Value of the side
    private String sideColor; // Color of the side
    // ************************
    // Constructors
    // ************************
    public Side() {} // Default constructor in case Java needs one

    public Side(int sideValue, String sideColor) {
        this.sideValue = sideValue;
        this.sideColor = sideColor;
    }
    // ************************
    // Getters/Setters
    // ************************
    public int getSideValue() {
        return sideValue;
    }
    public void setSideValue(int sideValue) {
        this.sideValue = sideValue;
    }
    public String getSideColor() {
        return sideColor;
    }
    public void setSideColor(String sideColor) {
        this.sideColor = sideColor;
    }
    // ************************
    // Object class override methods
    // ************************
    @Override
    public boolean equals(Object o) { // Frank prefers using getters rather than member variables
        if (this == o) return true;
        if (!(o instanceof Side)) return false;
        Side side = (Side) o;
        return getSideValue() == side.getSideValue() && Objects.equals(getSideColor(), side.getSideColor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getSideValue(), getSideColor());
    }
    @Override
    public String toString() {
        return "Side{" +
                "sideValue=" + sideValue +
                ", sideColor='" + sideColor + '\'' +
                '}';
    }
} // End of Side class
