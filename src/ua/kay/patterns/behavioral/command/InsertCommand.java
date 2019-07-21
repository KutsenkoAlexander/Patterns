package ua.kay.patterns.behavioral.command;

public class InsertCommand implements Command {
    private Database database;

    InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
