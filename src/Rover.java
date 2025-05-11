import models.Direction;
import models.Position;

public class Rover {
    private Direction heading;
    private Position position;

    public Rover(Integer x, Integer y, Direction heading) {
        this.position = new Position(x, y);
        this.heading = heading;
    }

    public Rover(Position position, Direction facingDirection) {
        this.position = position;
        this.heading = facingDirection;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public Direction getHeading() {
        return heading;
    }

    public String getRoverPosition() {
        String roverPosition = String.valueOf(position.getX()).concat(" " + String.valueOf(position.getY())).concat(" " + String.valueOf(heading.acronym));

        return  roverPosition;
    }

    public Direction left() {
        switch (heading) {
            case NORTH -> {
                heading = Direction.WEST;
                return heading;
            }
            case EAST -> {
                heading = Direction.NORTH;
                return heading;
            }
            case SOUTH -> {
                heading = Direction.EAST;
                return heading;
            }
            case WEST -> {
                heading = Direction.SOUTH;
                return heading;
            }
            default -> {
                return null;
            }
        }
    }

    public Direction right() {
        switch (heading){
            case NORTH -> {
                heading = Direction.EAST;
                return heading;
            }
            case EAST -> {
                heading = Direction.SOUTH;
                return heading;
            }
            case SOUTH -> {
                heading = Direction.WEST;
                return heading;
            }
            case WEST -> {
                heading = Direction.NORTH;
                return heading;
            }
            default -> {
                return null;
            }
        }
        }

    public void move() {
        switch (heading){
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
