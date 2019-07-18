package ua.kay.patterns.structural.proxy;

public class ProxyProject implements Project{
    private String url;
    private RealProject realProject;

    ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
