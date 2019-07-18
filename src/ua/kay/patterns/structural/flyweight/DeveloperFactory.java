package ua.kay.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    Developer getDeveloperBySpeciality(String speciality) {
         Developer developer = developers.get(speciality);
         if (developer == null) {
             switch (speciality) {
                 case "java":
                     System.out.println("Hiring Java developer...");
                     developer = new JavaDeveloper();
                     break;
                 case "c++":
                     System.out.println("Hiring C++ developer...");
                     developer = new CppDeveloper();
                     break;
             }
             developers.put(speciality, developer);
         }
         return developer;
    }
}
