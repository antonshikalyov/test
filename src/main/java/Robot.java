public class Robot {
    int z;
    int x;
    int y;
    String color;
    int power;
    Direction direction;

    public Robot(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("parametr int"+ x + y);
    }

    public Robot(float x,float y){
        this.x = Math.round(x);
        this.y = Math.round(y);
        System.out.println("parametr float "+ x + y);
    }


    public  Robot() {
        this.direction = Direction.UP;
        this.y = 0;
    }

    public  Robot(Direction direction) {
        this.direction = direction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //===========================================================================================

    public void stepForward() {
        int x=++1;
        int y=++1;
    }

    public void setPower() {
        this.power = power;
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
