package ua.kay.patterns.factorymethod;

import ua.kay.patterns.factorymethod.developer.Developer;
import ua.kay.patterns.factorymethod.factory.CppDeveloperFactory;
import ua.kay.patterns.factorymethod.factory.DeveloperFactory;
import ua.kay.patterns.factorymethod.factory.JavaDeveloperFactory;
import ua.kay.patterns.factorymethod.factory.PhpDeveloperFactory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if(speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }else if(speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else{
            throw new RuntimeException(speciality+" - is unknown speciality.");
        }
    }

}
