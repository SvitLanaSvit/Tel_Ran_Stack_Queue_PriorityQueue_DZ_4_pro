package myClasses;

import myInterface.MyQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyQueueImpl<T> implements MyQueue<T> {
    List<T> list = new ArrayList<>(200);

    @Override
    public boolean add(T el) {
        if (el == null)
            throw new NullPointerException();
        list.add(el);
        return list.contains(el);
    }

    @Override
    public T remove() {
        if(list.isEmpty()) {
            throw new EmptyStackException();
        }
        T el = list.remove(0);
        return el;
    }

    @Override
    public T element() {
        if(list.isEmpty()) {
            throw new EmptyStackException();
        }
        T el = list.get(0);
        return el;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
