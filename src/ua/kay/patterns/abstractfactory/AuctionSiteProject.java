package ua.kay.patterns.abstractfactory;

import ua.kay.patterns.abstractfactory.website.WebsiteTeamFactory;

/**
 * Created by Alexander on 16.02.2017.
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("=== Creating Auction website ===");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
