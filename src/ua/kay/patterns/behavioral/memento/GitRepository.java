package ua.kay.patterns.behavioral.memento;

public class GitRepository {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
