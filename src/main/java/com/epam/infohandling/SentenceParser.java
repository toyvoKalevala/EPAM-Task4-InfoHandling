package com.epam.infohandling;

public class SentenceParser extends AbstractParser {

    public SentenceParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String text) {

        Composite composite = new Composite();
        String[] parts = text.split("\\s");
        for (String part : parts) {
            Component paragraph = getSuccessor().parse(part);
            composite.add(paragraph);
        }
        return composite;
    }

}
