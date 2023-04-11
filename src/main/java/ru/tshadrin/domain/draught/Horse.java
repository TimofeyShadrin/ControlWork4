package ru.tshadrin.domain.draught;

public class Horse extends DraughtAnimal {
    public Horse(String name) {
        super(name);
        addCommand("Walk");
        addCommand("Trot");
    }
}
