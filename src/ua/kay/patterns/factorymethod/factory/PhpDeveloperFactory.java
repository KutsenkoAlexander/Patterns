package ua.kay.patterns.factorymethod.factory;

import ua.kay.patterns.factorymethod.developer.Developer;
import ua.kay.patterns.factorymethod.developer.PhpDeveloper;

/**
 * Created by Alexander on 14.02.2017.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
