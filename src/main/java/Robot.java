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

    public void setDirection() {
        int UP ,RIGHT,DOWN,LEFT;
        if (getY() > 0){
            return setDirection() = UP;
        }
        else if (getX() > 0){
            return setDirection() = RIGHT;
        }
        else if (getY() < 0){
            return setDirection() = DOWN;
        }
        else (getX() < 0){
            return setDirection() = LEFT;
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
