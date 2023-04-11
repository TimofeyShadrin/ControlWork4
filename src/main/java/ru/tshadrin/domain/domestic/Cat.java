package ru.tshadrin.domain.domestic;

import ru.tshadrin.domain.domestic.DomesticAnimal;

public class Cat extends DomesticAnimal {
    public Cat(String name) {
        super(name);
        addCommand("Jump");
        addCommand("Purr");
    }
}
