package com.example.codinginterview.stack;

import java.util.ArrayList;

public class MyStackImpl<T> implements MyStack<T> {

    private int index;
    private ArrayList<T> container;

    public MyStackImpl() {
        this.index = -1;
        this.container = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        container.add(item);
        index++;
    }

    @Override
    public T pop() {
        T item = container.get(index);
        container.remove(index);
        index--;
        return item;
    }
}
