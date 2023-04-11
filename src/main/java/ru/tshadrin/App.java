package ru.tshadrin;

import ru.tshadrin.domain.service.AnimalRegistry;
public class App 
{
    public static void main( String[] args )
    {
        AnimalRegistry registry = new AnimalRegistry();
        registry.displayMenu();
    }
}
