package ua.kay.patterns.factorymethod.factory;

import ua.kay.patterns.factorymethod.developer.CppDeveloper;
import ua.kay.patterns.factorymethod.developer.Developer;

/**
 * Created by Alexander on 14.02.2017.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
