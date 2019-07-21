package ua.kay.patterns.behavioral.command;

public class Developer {
    private Command insert;
    private Command select;
    private Command update;
    private Command delete;

    Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    void insertRecord() {
        insert.execute();
    }

    void selectRecord() {
        select.execute();
    }

    void updateRecord() {
        update.execute();
    }

    void deleteRecord() {
        delete.execute();
    }
}
