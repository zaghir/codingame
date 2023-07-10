package com.zaghir.project.codingame.robotmars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class TestHash {

    @Test
    public void tester_le_hash(){
        Robot r1 = new Robot(0,0);
        Robot r2 = new Robot(2,2);
        Robot r3 = new Robot(0,0);
        log.info("r1 => {}", r1.hashCode());
        log.info("r2 => {}", r2.hashCode());
        log.info("r3 => {}", r3.hashCode());

        Set<Robot> robots = new HashSet<>();
        robots.add(r1);
        robots.add(r2);
        robots.add(r3);
        for (Robot r:robots) {
            log.info("hashcode => {} robot {}", r.hashCode() , r);
        }
        log.info("r1  exist in hashSet => {}", robots.contains(r1));
        log.info("r3  exist in hashSet => {}", robots.contains(r3)); // ca fait mal car r3 n'exite pas ,il a seulemnt le meme hash


    }
}
