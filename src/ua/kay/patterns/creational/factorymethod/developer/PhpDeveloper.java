package ua.kay.patterns.creational.factorymethod.developer;

/**
 * Created by Alexander on 14.02.2017.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
