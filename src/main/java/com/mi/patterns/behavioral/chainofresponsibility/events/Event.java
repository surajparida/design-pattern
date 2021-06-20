package com.mi.patterns.behavioral.chainofresponsibility.events;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<T> {
    public int index = 0;
    public Map<Integer, Consumer<T>>
            handlers = new HashMap<>();

    public int subscribe(Consumer<T> handler) {
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(T args) {
        for (Consumer<T> handler : handlers.values())
            handler.accept(args);
    }
}
