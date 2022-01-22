package com.epam.infohandling.entity;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    public Composite() {
    }

    public Composite(List<? extends Component> components) {
        this.children.addAll(components);
    }

    public void add(Component child) {
        children.add(child);
    }

    public List<Component> getChildren() {
        return new ArrayList<>(children);
    }

    public int getChildrenNumber() {
        return children.size();
    }

}
