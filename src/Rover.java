import models.Direction;

public class Rover {
    private final Integer x;
    private final Integer y;
    private final Direction facingDirection;

    public Rover(Integer x, Integer y, Direction facingDirection) {
        this.x = x;
        this.y = y;
        this.facingDirection = facingDirection;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    public String getRoverPosition() {
        String roverPosition = String.valueOf(x).concat(" " + String.valueOf(y)).concat(" " + String.valueOf(facingDirection.acronym));

        return  roverPosition;
    }
}
