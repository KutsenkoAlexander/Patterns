package ua.kay.patterns.behavioral.chain;

public enum Priority {
    ROUTINE(1), IMPORTANT(2), ASAP(3);

    private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
