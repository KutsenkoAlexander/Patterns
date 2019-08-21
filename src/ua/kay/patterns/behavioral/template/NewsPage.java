package ua.kay.patterns.behavioral.template;

public class NewsPage extends WebSiteTemplate {
    @Override
    public void showContent() {
        System.out.println("News content");
    }
}
