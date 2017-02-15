package ua.kay.patterns.abstractfactory.banking;

import ua.kay.patterns.abstractfactory.Tester;

/**
 * Created by Alexander on 16.02.2017.
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester test banking code...");
    }
}
