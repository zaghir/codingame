package com.zaghir.project.codingame.robotmars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class RobotTest {

    @Test
    public void testRobotMovement() {
        Robot robot = new Robot(0, 0,Direction.NORTH);

        robot.moveForward(3);
        Assertions.assertEquals(0, robot.getX());
        Assertions.assertEquals(3, robot.getY());
        Assertions.assertEquals(Direction.NORTH, robot.getDirection());
        log.info(" test 1 {}",robot);

        robot.moveLeft();
        robot.moveForward(2);
        log.info(" test 2 {}",robot);
        Assertions.assertEquals(-2, robot.getX());
        Assertions.assertEquals(3, robot.getY());
        Assertions.assertEquals(Direction.WEST, robot.getDirection());


        robot.moveRight();
        robot.moveBackward(1);
        log.info(" test 3 {}",robot);
        Assertions.assertEquals(-2, robot.getX());
        Assertions.assertEquals(2, robot.getY());
        Assertions.assertEquals(Direction.NORTH, robot.getDirection());

    }
}
