package ua.kay.patterns.behavioral.command;

public class DatabaseRuner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
            new InsertCommand(database),
            new SelectCommand(database),
            new UpdateCommand(database),
            new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
