package start;

import myClasses.MyPriorityQueueImpl;
import myClasses.MyQueueImpl;
import myClasses.MyStackImpl;
import myClasses.MyStackImplObj;
import myInterface.MyQueue;
import myInterface.MyStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------STACK---------");
        MyStack<Integer> myStack = new MyStackImpl<>();
        myStack.push(5);
        myStack.push(8);
        myStack.push(19);
        myStack.push(3);

        System.out.println(myStack);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        //System.out.println(myStack.pop());

        System.out.println("-----------Queue---------");
        MyQueue<String> myQueue = new MyQueueImpl<>();
        System.out.println(myQueue.add("Hello"));
        System.out.println(myQueue.add("world!"));
        System.out.println(myQueue.add("I am"));
        System.out.println(myQueue.add("Svit!"));
        System.out.println(myQueue);

        System.out.println(myQueue.element());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        //System.out.println(myQueue.element());
        //System.out.println(myQueue.remove());

        System.out.println("--------PriorityQueue-----");
        MyPriorityQueueImpl<Integer> q = new MyPriorityQueueImpl<>();
        System.out.println(q.add(5));
        q.add(83);
        q.add(52);
        q.add(1);
        System.out.println(q);
//        System.out.println(q.remove(1));
//        System.out.println(q);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Peek : " + q.peek());
        System.out.println(q.poll());

        System.out.println("----PriorityQueue/String---");
        MyPriorityQueueImpl<String> priorityQueue = new MyPriorityQueueImpl<>();
        priorityQueue.add("Hello");
        priorityQueue.add("world");
        priorityQueue.add("I am");
        priorityQueue.add("Svit");
        System.out.println(priorityQueue);
        System.out.println("Peek : " + priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println("Peek : " + priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println("Peek : " + priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        System.out.println("----MyStack with Object[]---");
        MyStackImplObj<Integer> stackObj = new MyStackImplObj<>();
        stackObj.push(5);
        stackObj.push(8);
        stackObj.push(1);
        stackObj.push(10);
        stackObj.push(22);
        stackObj.push(87);
        stackObj.push(9);
        stackObj.push(6);
        stackObj.push(4);
        stackObj.push(8);
        stackObj.push(-1);

        System.out.println(stackObj);
    }
}
