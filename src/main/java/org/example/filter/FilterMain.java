package org.example.filter;


import java.util.List;

public class FilterMain {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);
        FilterImpl filter = new FilterImpl();

        Object[] objects = FilterUtil.filter(list.toArray(), filter);

        List.of(objects).forEach(System.out::println);
    }
}
