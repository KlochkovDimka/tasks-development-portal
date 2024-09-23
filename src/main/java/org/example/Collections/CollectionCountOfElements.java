package org.example.Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionCountOfElements<T> {
    public Map<T, Integer> countOfElements(T[] array) {
        Map<T, Integer> mapElements = new HashMap<>();
        int count = 0;
        for (T t : array) {
            if (!mapElements.containsKey(t)) {
                mapElements.put(t, count);
            } else {
                int newCount = mapElements.get(t) + 1;
                mapElements.put(t, newCount);
            }
        }
        return mapElements;
    }
}
