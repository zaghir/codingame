package com.zaghir.project.codingame.robotmars;

public class RobotM2 {

    private int x;
    private int y;
    private String direction;
    private int degree;

    public RobotM2(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = "NORTH";
        this.degree = 0;
    }

    public void moveLeft(int degrees) {
        degree -= degrees;
        if (degree < 0) {
            degree += 360;
        }
    }

    public void moveRight(int degrees) {
        degree += degrees;
        if (degree >= 360) {
            degree -= 360;
        }
    }

    public void moveForward(int steps) {
        double radian = Math.toRadians(degree);
        int deltaX = (int) Math.round(steps * Math.cos(radian));
        int deltaY = (int) Math.round(steps * Math.sin(radian));
        x += deltaX;
        y += deltaY;
    }

    public void moveBackward(int steps) {
        double radian = Math.toRadians(degree);
        int deltaX = (int) Math.round(steps * Math.cos(radian));
        int deltaY = (int) Math.round(steps * Math.sin(radian));
        x -= deltaX;
        y -= deltaY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public int getDegree() {
        return degree;
    }

}
