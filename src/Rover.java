import models.Direction;
import models.Position;

import java.util.HashMap;

public class Rover {

    private final HashMap<Direction, int[]> moveOffSets;
    private final HashMap<Integer, Direction> directionsMap;

    private Direction heading;
    private final Position position;

    public Rover( Position position, Direction facingDirection) {
        this.position = position;
        this.heading = facingDirection;
        this.directionsMap = getDirectionsMap();
        this.moveOffSets = getMoveOffSets();
    }

    private static HashMap<Integer, Direction> getDirectionsMap(){
        HashMap<Integer, Direction> directions = new HashMap<>();

        directions.put(0, Direction.NORTH);
        directions.put(1, Direction.EAST);
        directions.put(2, Direction.SOUTH);
        directions.put(3, Direction.WEST);

        return directions;
    }

    private static HashMap<Direction, int[]> getMoveOffSets() {
        HashMap<Direction, int[]> offSets = new HashMap<>();

        offSets.put(Direction.NORTH, new int[]{0, 1});
        offSets.put(Direction.EAST, new int[]{1, 0});
        offSets.put(Direction.SOUTH, new int[]{0, -1});
        offSets.put(Direction.WEST, new int[]{-1, 0});

        return offSets;
    }

    public static Rover navigateRover(Rover rover, String instructionsString) {
        String[] instructions = instructionsString.split("");

        for (String instruction : instructions) {
            switch (instruction){
                case "L" -> {
                    rover.left();
                }
                case "R" -> {
                    rover.right();
                }
                case "M" -> {
                    rover.move();
                }
            }
        }

        return rover;
    }

    public String getRoverPosition() {
        return String.valueOf(position.getX()).concat(" " + position.getY()).concat(" " + heading.acronym);
    }

    public Direction left() {
        Integer newDirectionId = (heading.id + 3) % 4;
        heading = directionsMap.get(newDirectionId);

        return  heading;
    }

    public Direction right() {
        Integer newDirectionId = (heading.id + 1) % 4;
        heading = directionsMap.get(newDirectionId);

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
