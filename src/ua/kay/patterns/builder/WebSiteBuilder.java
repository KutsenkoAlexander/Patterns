package ua.kay.patterns.builder;

public abstract class WebSiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void biuldName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
