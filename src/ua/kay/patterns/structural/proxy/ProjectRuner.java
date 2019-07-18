package ua.kay.patterns.structural.proxy;

public class ProjectRuner {
    public static void main(String[] args) {
        Project realProject = new ProxyProject("https://github.com/KutsenkoAlexander/Patterns");
        realProject.run();
    }
}
