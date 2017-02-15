package ua.kay.patterns.abstractfactory.banking;

import ua.kay.patterns.abstractfactory.Developer;

/**
 * Created by Alexander on 16.02.2017.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writs Java code...");
    }
}
