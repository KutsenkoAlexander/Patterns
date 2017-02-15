package ua.kay.patterns.abstractfactory.website;

import ua.kay.patterns.abstractfactory.Tester;

/**
 * Created by Alexander on 16.02.2017.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester test website code...");
    }
}
