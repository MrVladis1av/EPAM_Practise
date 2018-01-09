package Java9Task.task5.view;

import Java9Task.task5.model.Person;

import java.util.ArrayList;
import java.util.List;

public interface IDateBase {
    List<Person> persons = new ArrayList<Person>() {
        {
            add(new Person(20, "Vlad1", true));
            add(new Person(21, "Vlad2", true));
            add(new Person(22, "Vlad3", true));
            add(new Person(23, "Vlad4", true));
            add(new Person(17, "Vlad5", true));
            add(new Person(18, "Vlad6", true));

            add(new Person(18, "Lena", false));
            add(new Person(19, "Maria", false));
            add(new Person(20, "Ksenia", false));
            add(new Person(21, "Liza", false));
            add(new Person(22, "Daria", false));
        }
    };
}
