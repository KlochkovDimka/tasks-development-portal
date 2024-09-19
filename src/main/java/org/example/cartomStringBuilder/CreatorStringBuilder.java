package org.example.cartomStringBuilder;

import java.util.LinkedList;

public class CreatorStringBuilder {

    private final LinkedList<MementoStringBuilder> list = new LinkedList<>();

    public CreatorStringBuilder() {
    }

    public void save(String text) {
        list.add(new MementoStringBuilder(text));
    }

    public void removeLast() {
        if (!list.isEmpty()) {
            list.removeLast();
        }
    }

    public LinkedList<MementoStringBuilder> getList() {
        return list.isEmpty() ? null : list;
    }

    @Override
    public String toString() {
        return list.getLast().getValue();
    }
}
