package org.example;

import org.example.cartomStringBuilder.CustomStringBuilder;

public class Main {
    public static void main(String[] args) {
        CustomStringBuilder builder = new CustomStringBuilder();

        builder.append("One");
        builder.append("Two");
        builder.append("Threy");

        System.out.println(builder);

        builder.undo();

        System.out.println(builder);

        builder.append("Three");

        System.out.println(builder);
    }
}