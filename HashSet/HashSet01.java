import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[]){
        // creating hashset
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(3);
        set.add(6);
        set.add(1);
        
        // Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(8)){
            System.out.println("set does not contains 8");
        }

        // delete element
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contains 1 - we deleted 1");
        }

        set.add(7);
        set.add(14);
        set.add(5);

        // size of set
        System.out.println("size of set is : " + set.size());

        // print all elements of set
        System.out.println(set);

        // iterator - travels of set
        Iterator it = set.iterator();
         
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}