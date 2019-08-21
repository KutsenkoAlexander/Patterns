package ua.kay.patterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action");
        project.beWritten(junior);
        
        System.out.println("\nSenior in Action");
        project.beWritten(senior);
    }
}
