package models;

public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    public final String acronym;

    Direction(String acronym) {
        this.acronym = acronym;
    }
}
