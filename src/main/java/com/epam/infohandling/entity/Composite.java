package com.epam.infohandling.entity;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    public void add(Component child) {
        children.add(child);
    }
}
