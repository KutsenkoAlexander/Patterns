package ua.kay.patterns.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Developer is sleeping...");
    }
}
