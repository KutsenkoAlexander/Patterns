package ua.kay.patterns.creational.abstractfactory.website;

import ua.kay.patterns.creational.abstractfactory.Developer;
import ua.kay.patterns.creational.abstractfactory.ProjectManager;
import ua.kay.patterns.creational.abstractfactory.ProjectTeamFactory;
import ua.kay.patterns.creational.abstractfactory.Tester;

/**
 * Created by Alexander on 16.02.2017.
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
