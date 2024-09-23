package org.example.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterUtil {

    public static Object[] filter(Object[] objects, Filter filter) {
        List<Object> list = new ArrayList<>();

        for (Object o : objects) {
            Object newFilter = filter.apply(objects);
            list.add(newFilter);
        }
        return list.toArray();
    }
}
