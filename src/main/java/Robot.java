public class Robot {
    int x;
    int y;
    String color;

    public  Robot() {

    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    int turnleft;
    int turnright;

    public Direction setDirection() {
        if (getY() > 0){
            return Direction.UP;
        }
        else if (getX() > 0){
            return Direction.RIGHT;
        }
        else if (getY() < 0){
            return Direction.DOWN;
        }
        else {
            return Direction.LEFT;
        }
    }

    public void setTurnleft() {
        this.turnleft = turnleft;
    }

    public int getTurnleft() {

        return turnleft;
    }

    public void setTurnright() {
        this.turnright = turnright;
    }

    public int getTurnright() {
        return turnright;
    }
//    ================================================

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
