package com.epam.infohandling.logic;

import com.epam.infohandling.entity.Composite;

import java.util.Comparator;

public class ChildComponentsComparator implements Comparator<Composite> {
    @Override
    public int compare(Composite firstComposite, Composite secondComposite) {
        return firstComposite.getChildrenNumber() - secondComposite.getChildrenNumber();
    }
}
