package myInterface;

public interface MyPriorityQueue<T> {
    boolean add(T el);
    boolean remove(T el);
    T peek();
    T poll();
}
