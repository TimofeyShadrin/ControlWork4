package ru.tshadrin.domain.draught;

public class Donkey extends DraughtAnimal {
    public Donkey(String name) {
        super(name);
        addCommand("Carry");
        addCommand("Bray");
    }
}
