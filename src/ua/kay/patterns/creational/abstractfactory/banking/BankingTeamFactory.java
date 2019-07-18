package ua.kay.patterns.creational.abstractfactory.banking;

import ua.kay.patterns.creational.abstractfactory.Developer;
import ua.kay.patterns.creational.abstractfactory.ProjectManager;
import ua.kay.patterns.creational.abstractfactory.ProjectTeamFactory;
import ua.kay.patterns.creational.abstractfactory.Tester;

/**
 * Created by Alexander on 16.02.2017.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
