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
        robot1.setTurnleft();

        assertEquals(robot1.getTurnleft(),5);
    }

    @Test
    public void testTurnRight() {
        Robot robot1 = new Robot();
        robot1.setTurnright();

        assertEquals(robot1.getTurnright(),5);
    }
//=========================DIRECTION======================================
    @Test
    public void Direction() {
        Robot robot1 = new Robot();
        robot1.setUP();

        assertEquals(robot1.getY(),5);
    }

    @Test
    public void Direction() {
        Robot robot1 = new Robot();
        robot1.setRIGHT();

        assertEquals(robot1.getX(),5);
    }

    @Test
    public void Direction() {
        Robot robot1 = new Robot();
        robot1.setDOWN();

        assertEquals(robot1.getY(),5);
    }

    @Test
    public void Direction() {
        Robot robot1 = new Robot();
        robot1.setLEFT();

        assertEquals(robot1.getX(),5);
    }
//===========================================================================

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
