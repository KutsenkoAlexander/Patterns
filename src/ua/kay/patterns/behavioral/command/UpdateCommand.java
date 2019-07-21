package ua.kay.patterns.behavioral.command;

public class UpdateCommand implements Command {
    private Database database;

    UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
