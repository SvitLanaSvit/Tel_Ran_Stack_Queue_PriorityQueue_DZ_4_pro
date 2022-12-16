package myClasses;

import myInterface.MyStack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStackImplObj<T> implements MyStack<T> {
    private Object[] obj;
    private  int pointer;
    private static int DEFAULT_SIZE = 10;

    public MyStackImplObj(){
        obj = new Object[DEFAULT_SIZE];
        pointer = -1;
    }

    @Override
    public T push(T el) {
        if(pointer >= DEFAULT_SIZE - 1){
            growArray();
        }
        obj[++pointer] = el;
        return el;
    }

    private void growArray(){
        DEFAULT_SIZE *= 2;
        Object[] newObj = Arrays.copyOf(obj, DEFAULT_SIZE);
        obj = newObj;
    }

    @Override
    public T pop() {
        if(empty()){
            throw new EmptyStackException();
        }
        T objPop = (T) obj[pointer];
        obj[pointer] = null;
        pointer--;
        return objPop;
    }

    @Override
    public boolean empty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= pointer; i++){
            if(i != pointer)
                sb.append(obj[i]).append(", ");
            else sb.append(obj[i]).append("]");
        }
        return  sb.toString();
    }
}
