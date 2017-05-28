package ua.kay.patterns.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator {
    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report to client.";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
