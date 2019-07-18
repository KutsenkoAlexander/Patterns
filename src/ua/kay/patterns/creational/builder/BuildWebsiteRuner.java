package ua.kay.patterns.creational.builder;

public class BuildWebsiteRuner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
