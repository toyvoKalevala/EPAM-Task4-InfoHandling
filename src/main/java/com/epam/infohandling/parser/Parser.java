package com.epam.infohandling.parser;

import com.epam.infohandling.entity.Component;

public interface Parser {

    Component parse(String text);
}
