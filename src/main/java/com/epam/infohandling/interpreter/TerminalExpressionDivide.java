package com.epam.infohandling.interpreter;

public class TerminalExpressionDivide implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        Double secondMember = context.popValue();
        Double firstMember = context.popValue();

        if (secondMember == 0) {
            System.out.println("Dividing by zero");
        }
        context.pushValue(firstMember / secondMember);
    }
}
