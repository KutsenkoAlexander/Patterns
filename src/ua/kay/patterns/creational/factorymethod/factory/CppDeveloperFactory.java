package ua.kay.patterns.creational.factorymethod.factory;

import ua.kay.patterns.creational.factorymethod.developer.CppDeveloper;
import ua.kay.patterns.creational.factorymethod.developer.Developer;

/**
 * Created by Alexander on 14.02.2017.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
