package ua.kay.patterns.prototype;

public class ProjectFactory {
    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project copyProject() {
        return (Project) project.copy();
    }
}
