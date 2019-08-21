package ua.kay.patterns.behavioral.visitor;

public class Project implements ProjectElement {
    private ProjectElement[] elements;

    public Project() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : elements) {
            projectElement.beWritten(developer);
        }
    }
}
