package com.company.streamsAndDowncasting;

import java.util.stream.Stream;

public class Example {

    static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
        return numbers.filter(item -> item instanceof Integer)
                .map(item -> (Integer) item)
                .filter(item -> item > 0);
    }

    static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(Stream<? extends Number> numbers){
        return numbers.filter(item -> item instanceof Integer)
                .map(item -> (Integer) item)
                .filter(item -> item > 0);
    }
}
