package ru.tshadrin.domain.domestic;

import ru.tshadrin.domain.domestic.DomesticAnimal;

public class Dog extends DomesticAnimal {
    public Dog(String name) {
        super(name);
        addCommand("Sit");
        addCommand("Stay");
    }
}
