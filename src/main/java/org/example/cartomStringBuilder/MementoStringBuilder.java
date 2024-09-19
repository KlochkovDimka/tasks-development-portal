package org.example.cartomStringBuilder;

public class MementoStringBuilder {

    private final String value;

    public MementoStringBuilder(String text) {
        this.value = text;
    }

    public String getValue() {
        return value;
    }
}
