package ua.kay.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
