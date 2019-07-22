package ua.kay.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaDeveloper = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpresion();

        System.out.println("Does developer know Java Core: " + isJavaDeveloper.interpret("Java Core"));
        System.out.println("Does developer know Spring: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TermonalExpression("Java");
        Expression javaCore = new TermonalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpresion() {
        Expression java = new TermonalExpression("Java");
        Expression spring = new TermonalExpression("Spring");
        return new AndEpression(java, spring);
    }
}
