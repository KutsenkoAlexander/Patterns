package ua.kay.patterns.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
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
