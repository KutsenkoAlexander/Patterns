package ua.kay.patterns.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
