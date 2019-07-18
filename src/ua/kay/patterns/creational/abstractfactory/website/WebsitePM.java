package ua.kay.patterns.creational.abstractfactory.website;

import ua.kay.patterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Alexander on 16.02.2017.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project...");
    }
}
