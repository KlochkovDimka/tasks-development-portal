package org.example.cartomStringBuilder;

public class CustomStringBuilder {

    private final CreatorStringBuilder creator = new CreatorStringBuilder();

    public void append(String text) {
        if (creator.getList() != null) {
            creator.save(creator.toString() + text);
        } else {
            creator.save(text);
        }
    }

    public void undo() {
        creator.removeLast();
    }

    @Override
    public String toString() {
        return creator.toString();
    }
}
