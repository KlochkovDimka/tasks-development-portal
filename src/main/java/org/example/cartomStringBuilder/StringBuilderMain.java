package org.example.cartomStringBuilder;

public class StringBuilderMain {
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