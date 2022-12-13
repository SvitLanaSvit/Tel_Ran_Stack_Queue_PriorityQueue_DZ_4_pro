package myInterface;

public interface MyStack<T> {
    T push(T el);
    T pop();
    boolean empty();
}
