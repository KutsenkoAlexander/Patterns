package ua.kay.patterns.behavioral.state;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Developer is reading...");
    }
}
