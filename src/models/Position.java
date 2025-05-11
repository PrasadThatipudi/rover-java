package models;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position moveX(int offSetX) {
        x += offSetX;

        return this;
    }

    public Position moveY(int offSetY) {
        y += offSetY;

        return this;
    }
}
