package myClasses;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class MyComparatorImpl<T> implements  Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return compare(o1,o2);
    }
//    public Comparator<T> thenComparing(Comparator<? super T> other) {
//        Objects.requireNonNull(other);
//        return (Comparator<T> & Serializable) (c1, c2) -> {
//            int res = compare(c1, c2);
//            return (res != 0) ? res : other.compare(c1, c2);
//        };
//    }
}
