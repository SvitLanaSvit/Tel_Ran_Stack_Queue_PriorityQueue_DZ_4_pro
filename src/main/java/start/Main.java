package start;

import myClasses.*;
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

        System.out.println("\n-----------Queue---------");
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

        System.out.println("\n--------PriorityQueue-----");
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

        System.out.println("\n----PriorityQueue/String---");
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

        System.out.println("\n----MyStack with Object[]---");
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
        System.out.println(stackObj.pop());
        System.out.println(stackObj.empty());

        System.out.println("\n----MyQueue with Object[]---");
        MyQueueImplObj<String> queueObj = new MyQueueImplObj<>();
        System.out.println(queueObj.add("Svit"));
        System.out.println(queueObj.add("Dmytro"));
        System.out.println(queueObj);
        System.out.println("First element in queue: " + queueObj.element());
        System.out.println(queueObj.remove());
        System.out.println(queueObj);
        System.out.println("First element in queue: " + queueObj.element());
        System.out.println(queueObj.remove());
        System.out.println(queueObj);
        queueObj.add("Svit");
        queueObj.add("Lena");
        queueObj.add("Dmytro");
        queueObj.add("Il`ja");
        queueObj.add("Victor");
        queueObj.add("Sergij");
        queueObj.add("Ivanko");
        queueObj.add("Ivanka");
        queueObj.add("Victorija");
        queueObj.add("Niko");
        queueObj.add("Lana");
        System.out.println(queueObj);

        System.out.println("\n----MyPriorityQueue with Object[]---");
        MyPriorityQueueImplObj<Integer> priorityQueueObj = new MyPriorityQueueImplObj<>();
        System.out.println(priorityQueueObj.add(5));
        System.out.println(priorityQueueObj.add(9));
        System.out.println(priorityQueueObj.add(1));
        System.out.println(priorityQueueObj.add(8));
        System.out.println(priorityQueueObj.add(11));
        System.out.println(priorityQueueObj.add(10));
        System.out.println(priorityQueueObj.add(6));
        System.out.println(priorityQueueObj);

        System.out.println(priorityQueueObj.remove(11));
        System.out.println(priorityQueueObj);
        System.out.println(priorityQueueObj.poll());
        System.out.println(priorityQueueObj.poll());
        System.out.println(priorityQueueObj.poll());
        System.out.println("Priority element in priority queue: " + priorityQueueObj.peek());
        System.out.println(priorityQueueObj);
    }
}
