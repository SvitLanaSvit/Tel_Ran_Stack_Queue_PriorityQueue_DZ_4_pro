package myClasses;

import myInterface.MyStack;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStackImpl<T> implements MyStack<T> {
    Vector<T> vector = new Vector<>();

    @Override
    public T push(T el) {
        vector.add(el);
        return el;
    }
    @Override
    public T pop() {
        if(vector.isEmpty()) {
            throw new EmptyStackException();
        }
        T el = vector.get(vector.size() - 1);
        vector.remove(vector.size() - 1);
        return el;
    }

    @Override
    public boolean empty() {

        return vector.isEmpty();
    }

    @Override
    public String toString() {
        return vector.toString();
    }
}
