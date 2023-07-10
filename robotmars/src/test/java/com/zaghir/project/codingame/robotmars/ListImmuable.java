package com.zaghir.project.codingame.robotmars;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ListImmuable {

    @Test
    public void method_by_copy_list(){
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Element 1");
        mutableList.add("Element 2");

        List<String> immutableList = List.copyOf(mutableList);
        log.info(" list items {}", mutableList.size());
        immutableList.add("Element 3 ");
        immutableList.add("Element 4 ");

        log.info(" list items {}", mutableList.size());


    }
}
