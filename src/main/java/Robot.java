public class Robot {
    int x;
    int y;
    String color;
    Direction direction;

    public  Robot() {
        this.direction = Direction.UP;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setUP() {
        this.direction = Direction.UP;
    }

    public void setRIGHT() {
        this.direction = Direction.RIGHT;
    }

    public void setDOWN() {
        this.direction =  Direction.DOWN;
    }

    public void setLEFT() {
        this.direction =  Direction.LEFT;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void turnLeft() {
        Direction currentDirection = getDirection();
        if (currentDirection == Direction.UP) {
            setLEFT();
        }
        else if (currentDirection == Direction.LEFT) {
            setDOWN();
        }
        else if (currentDirection == Direction.DOWN) {
            setRIGHT();
        }
        else if (currentDirection == Direction.RIGHT) {
            setUP();
        }
    }

    public void turnRight() {
        Direction currentDirection = getDirection();
        if (currentDirection == Direction.UP) {
            setRIGHT();
        }
        else if (currentDirection == Direction.LEFT) {
            setUP();
        }
        else if (currentDirection == Direction.DOWN) {
            setLEFT();
        }
        else if (currentDirection == Direction.RIGHT) {
            setDOWN();
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
