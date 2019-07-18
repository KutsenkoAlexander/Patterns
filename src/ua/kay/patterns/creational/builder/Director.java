package ua.kay.patterns.creational.builder;

public class Director {
    private WebSiteBuilder builder;

    void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
