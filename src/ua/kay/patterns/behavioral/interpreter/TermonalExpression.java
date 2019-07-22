package ua.kay.patterns.behavioral.interpreter;

public class TermonalExpression implements Expression {
    private String data;

    TermonalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
