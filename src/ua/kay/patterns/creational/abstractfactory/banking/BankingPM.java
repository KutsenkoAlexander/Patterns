package ua.kay.patterns.creational.abstractfactory.banking;

import ua.kay.patterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Alexander on 16.02.2017.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
