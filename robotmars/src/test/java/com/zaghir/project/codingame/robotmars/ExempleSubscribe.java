package com.zaghir.project.codingame.robotmars;

import org.junit.jupiter.api.Test;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

public class ExempleSubscribe {

    @Test
    public void subscribe_en_java(){
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);

        Disposable disposable = numbers.subscribe(
                num -> System.out.println("Received number: " + num),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed")
        );
    }
}
