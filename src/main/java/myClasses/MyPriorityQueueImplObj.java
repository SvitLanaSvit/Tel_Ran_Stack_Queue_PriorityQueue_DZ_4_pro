package myClasses;
import myInterface.MyPriorityQueue;
import java.util.Arrays;

public class MyPriorityQueueImplObj<T> implements MyPriorityQueue<T> {
    private Object[] obj;
    private  int pointer;
    private static int DEFAULT_SIZE = 10;

    public MyPriorityQueueImplObj(){
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

    private void growArray(){
        DEFAULT_SIZE *= 2;
        obj = Arrays.copyOf(obj, DEFAULT_SIZE);
    }

    @Override
    public boolean remove(T el) {
        boolean isRemove = false;
        Object objRemove = null;
        int index = -1;
        if(!isEmpty()){
            for (int i = 0, j = 1; i <= pointer; i++, j++) {
                if(obj[i].equals(el)){
                    objRemove = obj[i];
                    index = i;
                }

                if(index > -1){
                    obj[i] = obj[j];
                }
            }
            if(objRemove != null){
                pointer--;
                isRemove = true;
            }
        }
        return isRemove;
    }

    private boolean isEmpty(){
        return pointer == -1;
    }

    @Override
    public T peek() {
        if(!isEmpty()) {
            T el = null;
            Object[] objSort = new Object[pointer + 1];
            System.arraycopy(obj, 0, objSort, 0, pointer + 1);
            Arrays.sort(objSort);
            el = (T) objSort[0];
            return (T) el;
        }
        else return null;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        } else {
            T el = null;
            Object[] objSort = new Object[pointer + 1];
            for(int i = 0; i <= pointer; i++){
                objSort[i] = obj[i];
            }
            Arrays.sort(objSort);
            el = (T) objSort[0];
            remove(el);
            return (T) el;
        }
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
