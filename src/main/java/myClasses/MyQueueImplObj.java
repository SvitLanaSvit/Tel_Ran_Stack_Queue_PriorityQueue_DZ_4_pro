package myClasses;

import myInterface.MyQueue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyQueueImplObj<T> implements MyQueue<T> {
    private Object[] obj;
    private int pointer;
    private static int DEFAULT_SIZE = 10;

    public MyQueueImplObj(){
        obj = new Object[DEFAULT_SIZE];
        pointer = -1;
    }
    @Override
    public boolean add(T el) {
        int count = pointer;
        if (el == null)
            throw new NullPointerException();
        if(pointer >= DEFAULT_SIZE - 1){
            growArray();
        }
        obj[++pointer] = el;
        return count + 1 == pointer;
    }

    @Override
    public T remove() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T objEl = (T) obj[0];
        for (int i = 0, j = 1; i <= pointer; i++, j++) {
            obj[i] = obj[j];
        }
        pointer--;
        return objEl;
    }

    private void growArray(){
        DEFAULT_SIZE *= 2;
        obj = Arrays.copyOf(obj, DEFAULT_SIZE);
    }

    @Override
    public T element() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) obj[0];
    }

    private boolean isEmpty(){
        return pointer == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= pointer; i++){
            if(i != pointer)
                sb.append(obj[i]).append(", ");
            else sb.append(obj[i]);
        }
        sb.append("]");
        return  sb.toString();
    }
}
