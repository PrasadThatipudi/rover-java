import models.Direction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    @Test
    void instantiateRover(){
        int x = 1;
        int y = 2;
        Direction direction = Direction.NORTH;
        Rover rover = new Rover(x, y, direction);

        assertEquals(x, rover.getX());
        assertEquals(y, rover.getY());
        assertEquals(direction, rover.getDirection());
    }
}
