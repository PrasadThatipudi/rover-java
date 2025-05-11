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
}
