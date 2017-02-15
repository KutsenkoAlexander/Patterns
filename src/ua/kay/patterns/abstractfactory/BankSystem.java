package ua.kay.patterns.abstractfactory;

import ua.kay.patterns.abstractfactory.banking.BankingTeamFactory;

/**
 * Created by Alexander on 16.02.2017.
 */
public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("=== Creating bank system ===");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
