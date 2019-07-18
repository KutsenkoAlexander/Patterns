package ua.kay.patterns.creational.factorymethod;

import ua.kay.patterns.creational.factorymethod.developer.Developer;
import ua.kay.patterns.creational.factorymethod.factory.CppDeveloperFactory;
import ua.kay.patterns.creational.factorymethod.factory.DeveloperFactory;
import ua.kay.patterns.creational.factorymethod.factory.JavaDeveloperFactory;
import ua.kay.patterns.creational.factorymethod.factory.PhpDeveloperFactory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
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
