import models.Direction;

public class Rover {
    private final int x;
    private final int y;
    private final Direction facingDirection;

    public Rover(int x, int y, Direction facingDirection) {
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
}
