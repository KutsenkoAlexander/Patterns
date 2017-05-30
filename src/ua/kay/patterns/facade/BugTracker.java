package ua.kay.patterns.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active!");
        this.activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is NOT active!");
        this.activeSprint = false;
    }
}
