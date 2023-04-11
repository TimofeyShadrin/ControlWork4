package ru.tshadrin.domain.draught;

public class Camel extends DraughtAnimal {
    public Camel(String name) {
        super(name);
        addCommand("Carry");
        addCommand("Rest");
    }
}
