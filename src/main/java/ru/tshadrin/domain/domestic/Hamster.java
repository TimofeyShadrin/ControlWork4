package ru.tshadrin.domain.domestic;

import ru.tshadrin.domain.domestic.DomesticAnimal;

public class Hamster extends DomesticAnimal {
    public Hamster(String name) {
        super(name);
        addCommand("Run");
        addCommand("Stop");
    }
}