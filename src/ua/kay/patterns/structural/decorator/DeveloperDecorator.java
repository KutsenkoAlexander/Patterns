package ua.kay.patterns.structural.decorator;

public class DeveloperDecorator implements Developer {
    private Developer developer;

    DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
