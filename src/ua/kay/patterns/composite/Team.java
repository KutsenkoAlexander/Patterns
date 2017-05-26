package ua.kay.patterns.composite;

import java.util.LinkedList;
import java.util.List;

public class Team {
    private List<Developer> developers = new LinkedList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
