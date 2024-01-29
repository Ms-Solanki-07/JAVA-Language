// Linked List Implemention by LinkedList class
import java.util.*;

public class LinkedList02{

    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>(); // use LinkedList class

        list.addFirst("Ms Solanki");
        list.addFirst("is");
        list.addFirst("My");
        System.out.println(list);

        list.add(2, "Ms");
        System.out.println(list);

        list.add("Hey");
        System.out.println(list);

        list.addLast("Hello");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}