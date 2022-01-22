package com.epam.infohandling.entity;

public class Lexeme implements Component {

    private final String value;
    private final LexemeType lexemeType;

    public Lexeme(String value, LexemeType lexemeType) {
        this.value = value;
        this.lexemeType = lexemeType;
    }

    public String getValue() {
        return value;
    }

    public static Lexeme toWord(String value) {
        return new Lexeme(value, LexemeType.WORD);
    }

    public static Lexeme toExpression(String value) {
        return new Lexeme(value, LexemeType.EXPRESSION);
    }

}
