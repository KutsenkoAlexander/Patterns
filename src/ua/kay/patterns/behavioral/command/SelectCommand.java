package ua.kay.patterns.behavioral.command;

public class SelectCommand implements Command {
    private Database database;

    SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
