package ua.kay.patterns.behavioral.iterator;

public class JavaDeveloperRuner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "MySQL", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Alexander", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer name: "+javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
