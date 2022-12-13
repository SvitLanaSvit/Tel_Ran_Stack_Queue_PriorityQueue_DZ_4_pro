package myInterface;

public interface MyQueue<T> {
    boolean add(T el);
    T remove();
    T element();
}
