package ua.kay.patterns.abstractfactory;

/**
 * Created by Alexander on 16.02.2017.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
