package com.epam.infohandling.interpreter;

public class NonTerminalExpression implements AbstractExpression {
    private final Double number;

    public NonTerminalExpression(Double number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {
        context.pushValue(number);
    }
}
