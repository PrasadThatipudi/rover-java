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

        rover.move();

        assertEquals("0 1 N", rover.getRoverPosition());
    }

    @Test
    void moveOneStepSouth(){
        Position position = new Position(0, 1);
        Direction heading = Direction.SOUTH;
        Rover rover = new Rover(position, heading);

        rover.move();

        assertEquals("0 0 S", rover.getRoverPosition());
    }

    @Test
    void moveOneStepEast(){
        Position position = new Position(0, 0);
        Direction heading = Direction.EAST;
        Rover rover = new Rover(position, heading);

        rover.move();

        assertEquals("1 0 E", rover.getRoverPosition());
    }

    @Test
    void moveOneStepWest(){
        Position position = new Position(1, 0);
        Direction heading = Direction.WEST;
        Rover rover = new Rover(position, heading);

        rover.move();

        assertEquals("0 0 W", rover.getRoverPosition());
    }
}
