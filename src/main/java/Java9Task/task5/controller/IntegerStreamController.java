package Java9Task.task5.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStreamController {
    public List<Integer> getTaskResult() {
        return Stream.iterate(10, x -> x + 10)
                .limit(10).map(x -> x / 2)
                .collect(Collectors.toList());
    }
}
