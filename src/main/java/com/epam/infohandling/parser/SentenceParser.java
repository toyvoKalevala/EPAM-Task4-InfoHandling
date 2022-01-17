package com.epam.infohandling.parser;

import com.epam.infohandling.entity.Composite;
import com.epam.infohandling.entity.Lexeme;

public class SentenceParser extends AbstractParser {

    public SentenceParser() {
        super();
    }

    @Override
    public Composite parse(String text) {

        Composite composite = new Composite();
        String[] lexemes = text.split("\\s");
        for (String lexeme : lexemes) {
            Lexeme convertedLexeme;
            if (lexeme.contains("[")) {
                convertedLexeme = Lexeme.toExpression(lexeme);
            } else {
                convertedLexeme = Lexeme.toWord(lexeme);
            }
            composite.add(convertedLexeme);
        }
        return composite;
    }

}
