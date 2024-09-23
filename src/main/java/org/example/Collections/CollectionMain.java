package org.example.Collections;

import java.util.Map;

public class CollectionMain {
    public static void main(String[] args) {
        CollectionCountOfElements<Integer> countOfElementsInteger = new CollectionCountOfElements<>();
        Integer[] ints = {1, 2, 3, 3, 3, 2, 4, 2};
        Map<Integer, Integer> map = countOfElementsInteger.countOfElements(ints);
        System.out.println(map);

        CollectionCountOfElements<String> countOfElementsString = new CollectionCountOfElements<>();
        String[] strings = {"a", "b", "a", "a"};
        Map<String, Integer> mapString = countOfElementsString.countOfElements(strings);
        System.out.println(mapString);
    }
}
