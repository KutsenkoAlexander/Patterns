package ua.kay.patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitRepository repository = new GitRepository();

        System.out.println("\nCreating a new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current project to Git...\n");
        repository.setSave(project.save());

        System.out.println("Writing new code...\n");

        Thread.sleep(5000);

        System.out.println("Updating project to version 1.1");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Rolling back to version 1.0");
        project.load(repository.getSave());
        System.out.println(project);
    }
}
