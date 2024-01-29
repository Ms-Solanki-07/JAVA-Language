import java.util.ArrayList;
import java.util.Collections;

class MyArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println(list);

        // get element
        int element = list.get(1);
        System.out.println("element on 1st index:" + element);

        // add element in between in ArrayList
        list.add(1,3); // 1->index and 3-> element
        list.add(2,9);
        System.out.println(list);

        // set element
        list.set(0,1); // 0-> index & 1-> element
        list.set(3,4);
        System.out.println(list);

        // delete element
        list.remove(3); // 3-> index 
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println("size of ArrayList:" + size);

        // loops
        System.out.print("Element of ArrayList:");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println("Sorted list:" + list);

    }
}