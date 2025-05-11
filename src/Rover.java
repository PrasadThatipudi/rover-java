import models.Direction;
import models.Position;

import java.util.HashMap;

public class Rover {
    private final HashMap<Direction, Direction> leftDirections;
    private final HashMap<Direction, Direction> rightDirections;
    private final HashMap<Direction, int[]> moveOffSets;

    private Direction heading;
    private final Position position;

    public Rover( Position position, Direction facingDirection) {
        this.position = position;
        this.heading = facingDirection;
        this.leftDirections = getLeftDirections();
        this.rightDirections = getRightDirections();
        this.moveOffSets = getMoveOffSets();
    }

    private static HashMap<Direction, Direction> getLeftDirections(){
        HashMap<Direction, Direction> leftDirections = new HashMap<>();

        leftDirections.put(Direction.NORTH, Direction.WEST);
        leftDirections.put(Direction.EAST, Direction.NORTH);
        leftDirections.put(Direction.SOUTH, Direction.EAST);
        leftDirections.put(Direction.WEST, Direction.SOUTH);

        return leftDirections;
    }

    private static HashMap<Direction, Direction> getRightDirections() {
        HashMap<Direction, Direction> rightDirections = new HashMap<>();

        rightDirections.put(Direction.NORTH,Direction.EAST);
        rightDirections.put(Direction.EAST,Direction.SOUTH);
        rightDirections.put(Direction.SOUTH,Direction.WEST);
        rightDirections.put(Direction.WEST,Direction.NORTH);

        return rightDirections;
    }

    private static HashMap<Direction, int[]> getMoveOffSets() {
        HashMap<Direction, int[]> offSets = new HashMap<>();

        offSets.put(Direction.NORTH, new int[]{0, 1});
        offSets.put(Direction.EAST, new int[]{1, 0});
        offSets.put(Direction.SOUTH, new int[]{0, -1});
        offSets.put(Direction.WEST, new int[]{-1, 0});
        return offSets;
    }

    public String getRoverPosition() {
        return String.valueOf(position.getX()).concat(" " + position.getY()).concat(" " + heading.acronym);
    }

    public Direction left() {
        heading = leftDirections.get(heading);

        return  heading;
    }

    public Direction right() {
        heading = rightDirections.get(heading);

        return  heading;
    }

    public Rover move() {
        int offSetX = moveOffSets.get(heading)[0];
        int offSetY = moveOffSets.get(heading)[1];

        position.moveX(offSetX);
        position.moveY(offSetY);

        return this;
    }
}
