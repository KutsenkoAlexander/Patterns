package ua.kay.patterns.abstractfactory.website;

import ua.kay.patterns.abstractfactory.Developer;
import ua.kay.patterns.abstractfactory.ProjectManager;
import ua.kay.patterns.abstractfactory.ProjectTeamFactory;
import ua.kay.patterns.abstractfactory.Tester;

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
