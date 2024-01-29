// Queue using Collection FrameWork

import java.util.*;
public class Queue04{

    public static void main(String args[]){
        // Queue<Integer> q = new LinkedList<>(); // LinkedList queue
        Queue<Integer> q = new ArrayDeque<>(); // double ended queue

        // Queue -> Interfaces | LinkedList -> Class | ArrayDeque -> Class
        // Class ke object bnte hai but Interfaces ke object nhi bnte hai

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}