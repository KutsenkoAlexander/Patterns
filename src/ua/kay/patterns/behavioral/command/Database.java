package ua.kay.patterns.behavioral.command;

public class Database {
    void insert() {
        System.out.println("Inserting record...");
    }

    void select() {
        System.out.println("Reading record...");
    }

    void update() {
        System.out.println("Updating record...");
    }

    void delete() {
        System.out.println("Deleting record...");
    }
}
