import models.Direction;
import models.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    @Test
    void instantiateRover(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        assertEquals("0 0 N", rover.getRoverPosition());
    }

    @Test
    void left(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        assertEquals(Direction.WEST, rover.left());
    }

    @Test
    void multipleLeft(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        rover.left();

        assertEquals(Direction.SOUTH, rover.left());
    }

    @Test
    void right(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        assertEquals(Direction.EAST, rover.right());
    }

    @Test
    void multipleRight(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        rover.right();

        assertEquals(Direction.SOUTH, rover.right());
    }

    @Test
    void moveOneStepNorth(){
        Position position = new Position(0, 0);
        Direction heading = Direction.NORTH;
        Rover rover = new Rover(position, heading);

        assertEquals("0 1 N", rover.move().getRoverPosition());
    }

    @Test
    void moveOneStepSouth(){
        Position position = new Position(0, 1);
        Direction heading = Direction.SOUTH;
        Rover rover = new Rover(position, heading);

        assertEquals("0 0 S", rover.move().getRoverPosition());
    }

    @Test
    void moveOneStepEast(){
        Position position = new Position(0, 0);
        Direction heading = Direction.EAST;
        Rover rover = new Rover(position, heading);

        assertEquals("1 0 E", rover.move().getRoverPosition());
    }

    @Test
    void moveOneStepWest(){
        Position position = new Position(1, 0);
        Direction heading = Direction.WEST;
        Rover rover = new Rover(position, heading);

        assertEquals("0 0 W", rover.move().getRoverPosition());
    }
    
    @Test
    void instructToTurnLeft(){
        String instructions = "L";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.NORTH);

        assertEquals("0 0 W", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToTurnRight(){
        String instructions = "R";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.NORTH);

        assertEquals("0 0 E", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingNorth(){
        String instructions = "M";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.NORTH);

        assertEquals("0 1 N", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingEast(){
        String instructions = "M";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.EAST);

        assertEquals("1 0 E", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingSouth(){
        String instructions = "M";

        Position position = new Position(0,1);
        Rover rover = new Rover(position, Direction.SOUTH);

        assertEquals("0 0 S", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingWest(){
        String instructions = "M";

        Position position = new Position(1,0);
        Rover rover = new Rover(position, Direction.WEST);

        assertEquals("0 0 W", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingSouthOnEdge(){
        String instructions = "M";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.SOUTH);

        assertEquals("0 0 S", Rover.navigateRover(rover, instructions).getRoverPosition());
    }

    @Test
    void instructToMoveHeadingWestOnEdge(){
        String instructions = "M";

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.WEST);

        assertEquals("0 0 W", Rover.navigateRover(rover, instructions).getRoverPosition());
    }
}
