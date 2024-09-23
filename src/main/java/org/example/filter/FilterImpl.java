package org.example.filter;

import java.util.List;

public class FilterImpl implements Filter {
    @Override
    public Object apply(Object o) {
        return List.of(o);
    }
}
