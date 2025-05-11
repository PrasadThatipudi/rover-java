package models;

public enum Direction {
    NORTH("N", 0),
    EAST("E", 1),
    SOUTH("S", 2),
    WEST("W", 3);

    public final String acronym;
    public final int id;

    Direction(String acronym, int id) {
        this.acronym = acronym;
        this.id = id;
    }
}
