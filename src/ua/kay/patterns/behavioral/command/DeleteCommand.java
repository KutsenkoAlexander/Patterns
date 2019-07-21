package ua.kay.patterns.behavioral.command;

public class DeleteCommand implements Command {
    private Database database;

    DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
