package ua.kay.patterns.behavioral.chain;

public class SMSNotifier extends Notifier {
    SMSNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
