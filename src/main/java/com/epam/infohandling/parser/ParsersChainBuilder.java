package com.epam.infohandling.parser;

public class ParsersChainBuilder {

    public Parser build() {
        return new TextParser(new ParagraphParser(new SentenceParser()));
    }
}
