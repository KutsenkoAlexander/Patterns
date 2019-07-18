package ua.kay.patterns.structural.bridge;

public abstract class Program {
    protected Developer developer;

    Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
