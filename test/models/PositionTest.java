package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void instantiatePosition(){
        int x = 0;
        int y = 0;
        Position position = new Position(x, y);

        assertEquals(x, position.getX());
        assertEquals(y, position.getY());
    }

    @Test
    void moveForwardOnX(){
        int x = 0;
        int y = 0;
        Position position = new Position(x, y);
        int offSetX = 1;

        position.moveX(offSetX);

        assertEquals(x + offSetX,position.getX());
        assertEquals(y, position.getY());
    }

    @Test
    void moveBackwardOnX(){
        int x = 1;
        int y = 0;
        Position position = new Position(x, y);
        int offSetX = -1;

        position.moveX(offSetX);

        assertEquals(x + offSetX,position.getX());
        assertEquals(y, position.getY());
    }

    @Test
    void moveForwardOnY(){
        int x = 0;
        int y = 0;
        Position position = new Position(x, y);
        int offSetY = 1;

        position.moveY(offSetY);

        assertEquals(x ,position.getX());
        assertEquals(y + offSetY, position.getY());
    }

    @Test
    void moveBackwardOnY(){
        int x = 0;
        int y = 1;
        Position position = new Position(x, y);
        int offSetY = -1;

        position.moveY(offSetY);

        assertEquals(x ,position.getX());
        assertEquals(y + offSetY, position.getY());
    }

    @Test
    void moveOnEdgeOfX(){
        int x = 0;
        int y = 0;
        Position position = new Position(x, y);
        int offSetX = -1;

        assertEquals(null, position.moveX(offSetX));
    }

    @Test
    void moveOnEdgeOfY(){
        int x = 0;
        int y = 0;
        Position position = new Position(x, y);
        int offSetY = -1;

        assertEquals(null, position.moveY(offSetY));
    }
}