package ua.kay.patterns.creational.prototype;

public class ProjectFactory {
    private Project project;

    ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project copyProject() {
        return (Project) project.copy();
    }
}
