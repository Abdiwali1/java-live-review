package week11;

import java.util.*;

public class StackVsQueue {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); //LIFO
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("4");
        System.out.println(stack);

        System.out.println("top of stack: " + stack.peek());
        System.out.println("remove the top from stack: " + stack.pop());
        System.out.println(stack);

        System.out.println("what is on top of the stack now? " + stack.peek());

        stack.push("selenium");

        System.out.println("last stack check: " + stack.peek());
        System.out.println(stack);

        b();

        Queue<String> queue = new ArrayDeque<>(); // FIFO
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("4");

        System.out.println(queue);

        System.out.println("beginning of queue: " + queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        ArrayList<Integer> list = new ArrayList<>();

        Deque<String> data = new LinkedList<>();
        data.add("monday");
        data.addFirst("sunday");

        System.out.println(data);

    }

    /*
        a()
        b()
        main()
     */

    public static void a(){
        System.out.println("a");
    }

    public static void b(){
        a();
        System.out.println("b");
    }
}
