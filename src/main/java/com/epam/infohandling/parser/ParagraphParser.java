package com.epam.infohandling.parser;

import com.epam.infohandling.entity.Component;
import com.epam.infohandling.entity.Composite;

public class ParagraphParser extends AbstractParser {

    public ParagraphParser(Parser successor) {
        super(successor);
    }

    @Override
    public Composite parse(String text) {

        Composite composite = new Composite();
        String[] parts = text.split("\\.|\\?|\\!|\\.{3}");
        for (String part : parts) {
            Component sentence = getSuccessor().parse(part);
            composite.add(sentence);
        }
        return composite;
    }

}
