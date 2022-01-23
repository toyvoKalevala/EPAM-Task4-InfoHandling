package com.epam.infohandling.interpreter;

public class TerminalExpressionAdd implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        Double result = context.popValue() + context.popValue();
        context.pushValue(result);
    }
}
