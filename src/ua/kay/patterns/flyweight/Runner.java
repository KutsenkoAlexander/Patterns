package ua.kay.patterns.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new LinkedList<>();

        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));
        developers.add(developerFactory.getDeveloperBySpecialisty("java"));

        developers.add(developerFactory.getDeveloperBySpecialisty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialisty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialisty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialisty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialisty("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
