package ua.kay.patterns.structural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator {
    TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    String sendWeekReport(){
        return "Send week report to client.";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
