package ua.kay.patterns.behavioral.chain;

import static ua.kay.patterns.behavioral.chain.Priority.*;

public class BugTreckerRuner {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(ROUTINE);
        Notifier emailNotifier = new EmailNotifier(IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", IMPORTANT);
        reportNotifier.notifyManager("Huston, we've had problems here!!!", ASAP);
    }
}
