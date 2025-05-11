import models.Direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    @Test
    void instantiateRover(){
        int x = 1;
        int y = 2;
        Direction facingDirection = Direction.NORTH;
        Rover rover = new Rover(x, y, facingDirection);

        assertEquals("1 2 N", rover.getRoverPosition());
    }

    @Test
    void left(){
        int x = 1;
        int y = 2;
        Direction facingDirection = Direction.NORTH;
        Rover rover = new Rover(x, y, facingDirection);

        assertEquals(Direction.WEST, rover.left());
    }

    @Test
    void multipleLeft(){
        int x = 1;
        int y = 2;
        Direction facingDirection = Direction.NORTH;
        Rover rover = new Rover(x, y, facingDirection);

        rover.left();

        assertEquals(Direction.SOUTH, rover.left());
    }
}
