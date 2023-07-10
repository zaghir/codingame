package com.zaghir.project.codingame.robotmars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Robot {
    private int x;
    private int y;
    private Direction direction;
    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = Direction.NORTH; // Direction par défaut au nord
    }
//                                                      N
//                                                      |
//                                                W-----------E
//                                                      |
//                                                      S
    public void moveLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
        }
    }

    public void moveRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
        }
    }

//            Y                                            N
//            |                                            |
//            |                                      W-----------E
//            |          *                                 |
//            |                                            S
//            |     *
//            |
//            |--------------------------------> X

    public void moveForward(int steps) {
        switch (direction) {
            case NORTH:
                y += steps;
                break;
            case EAST:
                x += steps;
                break;
            case SOUTH:
                y -= steps;
                break;
            case WEST:
                x -= steps;
                break;
        }
    }

    public void moveBackward(int steps) {
        switch (direction) {
            case NORTH:
                y -= steps;
                break;
            case EAST:
                x -= steps;
                break;
            case SOUTH:
                y += steps;
                break;
            case WEST:
                x += steps;
                break;
        }
    }
}
