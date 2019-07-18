package ua.kay.patterns.creational.abstractfactory.banking;

import ua.kay.patterns.creational.abstractfactory.Developer;

/**
 * Created by Alexander on 16.02.2017.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writs Java code...");
    }
}
