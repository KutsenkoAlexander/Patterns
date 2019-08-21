package ua.kay.patterns.behavioral.template;

public class WelcomePage extends WebSiteTemplate {
    @Override
    public void showContent() {
        System.out.println("Welcome");
    }
}
