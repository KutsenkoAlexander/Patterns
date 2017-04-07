package ua.kay.patterns.builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder {
    @Override
    void biuldName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
