package org.example.cartomStringBuilder;

import java.util.Stack;

public class CreatorStringBuilder {

    private final Stack<MementoStringBuilder> list = new Stack<>();

    public CreatorStringBuilder() {
    }

    public void save(String text) {
        list.add(new MementoStringBuilder(text));
    }

    public void removeLast() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

    public Stack<MementoStringBuilder> getList() {
        return list.isEmpty() ? null : list;
    }

    @Override
    public String toString() {
        return list.get(list.size() - 1).getValue();
    }
}
