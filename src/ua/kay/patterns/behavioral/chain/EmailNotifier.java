package ua.kay.patterns.behavioral.chain;

public class EmailNotifier extends Notifier {
    EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
