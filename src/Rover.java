import models.Direction;

public class Rover {
    private final Integer x;
    private final Integer y;
    private Direction facingDirection;

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

    public Direction left() {
        switch (facingDirection) {
            case NORTH -> {
                facingDirection = Direction.WEST;
                return facingDirection;
            }
            case EAST -> {
                facingDirection = Direction.NORTH;
                return facingDirection;
            }
            case SOUTH -> {
                facingDirection = Direction.EAST;
                return facingDirection;
            }
            case WEST -> {
                facingDirection = Direction.SOUTH;
                return facingDirection;
            }
            default -> {
                return null;
            }
        }
    }

    public Direction right() {
        switch (facingDirection){
            case NORTH -> {
                facingDirection = Direction.EAST;
                return facingDirection;
            }
            case EAST -> {
                facingDirection = Direction.SOUTH;
                return facingDirection;
            }
            case SOUTH -> {
                facingDirection = Direction.WEST;
                return facingDirection;
            }
            case WEST -> {
                facingDirection = Direction.NORTH;
                return facingDirection;
            }
            default -> {
                return null;
            }
        }
        }
}
