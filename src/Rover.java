import models.Direction;
import models.Position;

import java.util.HashMap;

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
        HashMap<Direction, Direction> leftDirections = new HashMap<>();
        
        leftDirections.put(Direction.NORTH, Direction.WEST);
        leftDirections.put(Direction.EAST, Direction.NORTH);
        leftDirections.put(Direction.SOUTH, Direction.EAST);
        leftDirections.put(Direction.WEST, Direction.SOUTH);

        heading = leftDirections.get(heading);
        return  heading;
    }


    public Direction right() {
        HashMap<Direction, Direction> rightDirections = new HashMap<>();

        rightDirections.put(Direction.NORTH,Direction.EAST);
        rightDirections.put(Direction.EAST,Direction.SOUTH);
        rightDirections.put(Direction.SOUTH,Direction.WEST);
        rightDirections.put(Direction.WEST,Direction.NORTH);

        heading = rightDirections.get(heading);
        return  heading;
    }

    public void move() {
        HashMap<Direction, int[]> offSets = new HashMap<>();

        offSets.put(Direction.NORTH, new int[]{0, 1});
        offSets.put(Direction.EAST, new int[]{1, 0});
        offSets.put(Direction.SOUTH, new int[]{0, -1});
        offSets.put(Direction.WEST, new int[]{-1, 0});

        int offSetX = offSets.get(heading)[0];
        int offSetY = offSets.get(heading)[1];

        position.moveX(offSetX);
        position.moveY(offSetY);
    }
}
