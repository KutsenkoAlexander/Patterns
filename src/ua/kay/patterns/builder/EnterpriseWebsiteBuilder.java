package ua.kay.patterns.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void biuldName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
