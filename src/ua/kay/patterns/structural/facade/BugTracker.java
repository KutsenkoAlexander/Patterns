package ua.kay.patterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    boolean isActiveSprint() {
        return activeSprint;
    }

    void startSprint() {
        System.out.println("Sprint is active!");
        this.activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is NOT active!");
        this.activeSprint = false;
    }
}
