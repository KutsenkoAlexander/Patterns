package ua.kay.patterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier {
    SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
