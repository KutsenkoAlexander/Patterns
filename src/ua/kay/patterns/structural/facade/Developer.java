package ua.kay.patterns.structural.facade;

public class Developer {
    void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading books...");
        }
    }
}
