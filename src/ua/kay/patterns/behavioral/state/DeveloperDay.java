package ua.kay.patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity sleeping = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(sleeping);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
