package com.zaghir.project.codingame.robotmars;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/robotM2")
public class RobotM2Controller {

    private RobotM2 robot;

    @PostMapping("/initialize")
    public void initializeRobot(@RequestParam int x, @RequestParam int y) {
        robot = new RobotM2(x, y);
    }

    @PostMapping("/moveLeft")
    public void moveLeft(@RequestParam int degrees) {
        robot.moveLeft(degrees);
    }

    @PostMapping("/moveRight")
    public void moveRight(@RequestParam int degrees) {
        robot.moveRight(degrees);
    }

    @PostMapping("/moveForward")
    public void moveForward(@RequestParam int steps) {
        robot.moveForward(steps);
    }

    @PostMapping("/moveBackward")
    public void moveBackward(@RequestParam int steps) {
        robot.moveBackward(steps);
    }

    @GetMapping("/position")
    public String getPosition() {
        return "Current Position: (" + robot.getX() + ", " + robot.getY() + ")";
    }
}
