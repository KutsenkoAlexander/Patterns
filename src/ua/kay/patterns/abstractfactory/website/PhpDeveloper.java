package ua.kay.patterns.abstractfactory.website;

import ua.kay.patterns.abstractfactory.Developer;

/**
 * Created by Alexander on 16.02.2017.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writs PHP code...");
    }
}
