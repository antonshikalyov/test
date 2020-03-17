import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRobotTest {

    @Test
    public void testRobotColor() {
        Robot robot1 = new Robot();
        robot1.setColor("red");

        assertEquals(robot1.getColor(),"red");
    }

    @Test
    public void testTurnLeft() {
        Robot robot1 = new Robot();
        robot1.turnLeft();

        assertEquals(robot1.getDirection(),Direction.LEFT);
    }

    @Test
    public void testTurnRight() {
        Robot robot1 = new Robot();
        robot1.turnRight();

        assertEquals(robot1.getDirection(),Direction.RIGHT);
    }

    @Test
    public void testRobotX() {
        Robot robot1 = new Robot();
        robot1.setX(10);

        assertEquals(robot1.getX(),10);
    }

    @Test
    public void testRobotY() {
        Robot robot1 = new Robot();
        robot1.setY(10);

        assertEquals(robot1.getY(),10);
    }
}
