package com.epam.infohandling;

public class ParagraphParser extends AbstractParser {

    public ParagraphParser(Parser successor) {
        super(successor);
    }

    @Override
    public Component parse(String text) {

        Composite composite = new Composite();
        String[] parts = text.split("\\.|\\?|\\!|\\.{3}");
        for (String part : parts) {
            Component paragraph = getSuccessor().parse(part);
            composite.add(paragraph);
        }
        return composite;
    }

}
