package Java9Task.task5.controller;

import Java9Task.task5.model.Person;
import Java9Task.task5.view.IDateBase;

import java.util.List;
import java.util.stream.Collectors;

public class PersonController {
    public List<Person> getAllSoldiers() {
        return IDateBase.persons.stream()
                .filter(x -> x.getAge() > 18 && x.getAge() < 27)
                .filter(x -> x.isSex())
                .collect(Collectors.toList());
    }

    public double

    getAverageAgeOfWomen() {
        return IDateBase.persons.stream()
                .filter(x -> !x.isSex())
                .mapToDouble(x -> x.getAge())
                .average().getAsDouble();
    }
}
