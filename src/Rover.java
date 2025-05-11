import models.Direction;
import models.Position;

public class Rover {
    private Direction facingDirection;
    private Position position;

    public Rover(Integer x, Integer y, Direction facingDirection) {
        this.position = new Position(x, y);
        this.facingDirection = facingDirection;
    }

    public Rover(Position position, Direction facingDirection) {
        this.position = position;
        this.facingDirection = facingDirection;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    public String getRoverPosition() {
        String roverPosition = String.valueOf(position.getX()).concat(" " + String.valueOf(position.getY())).concat(" " + String.valueOf(facingDirection.acronym));

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

    public void move() {
        switch (facingDirection){
            case NORTH -> {
                position.moveY(1);
                return;
            }
            case EAST -> {
                position.moveX(1);
                return;
            }
            case SOUTH -> {
                position.moveY(-1);
                return;
            }
            case WEST -> {
                position.moveX(-1);
                return;
            }
        }
    }
}
