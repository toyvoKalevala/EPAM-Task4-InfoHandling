package com.epam.infohandling.logic;

import com.epam.infohandling.entity.Component;
import com.epam.infohandling.entity.Composite;
import com.epam.infohandling.entity.Lexeme;
import com.epam.infohandling.parser.Parser;
import com.epam.infohandling.parser.ParsersChainBuilder;

import java.util.ArrayList;
import java.util.List;

public class TextLogic {

    public Component parse(String text) {
        ParsersChainBuilder builder = new ParsersChainBuilder();
        Parser parser = builder.build();
        return parser.parse(text);
    }

    public Composite sortParagraphsBySentenceNumber(Composite text) {
        List<Composite> paragraphs = new ArrayList<>();
        for (Component component : text.getChildren()) {
            paragraphs.add((Composite) component);
        }
        paragraphs.sort(new ChildComponentsComparator());
        return new Composite(paragraphs);
    }

    public Composite sortWordsByTargetCharacterNumber(Composite sentence, char targetCharacter) {
        List<Lexeme> lexemes = new ArrayList<>();
        for (Component component : sentence.getChildren()) {
            lexemes.add((Lexeme) component);
        }
        lexemes.sort(new TargetCharacterNumberComparator(targetCharacter));
        return new Composite(lexemes);
    }
}
