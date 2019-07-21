package ua.kay.patterns.behavioral.chain;

public abstract class Notifier {
    private Priority priority;
    private Notifier nextNotifier;

    Notifier(Priority priority) {
        this.priority = priority;
    }

    Notifier getNextNotifier() {
        return nextNotifier;
    }

    void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    void notifyManager(String message, Priority priority) {
        if (priority.getLevel() >= this.priority.getLevel()) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, priority);
        }
    }

    public abstract void write(String message);
}
