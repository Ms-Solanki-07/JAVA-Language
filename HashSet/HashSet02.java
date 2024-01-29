// Question- Union of 2 Array And Intersection of 2 array

import java.util.*;
public class HashSet02{
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.print("Union: " + set);

        System.out.println();

        System.out.println("size of union: " + set.size());
    }

    public static void intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersec_set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                intersec_set.add(arr2[i]);
                set.remove(arr2[i]);
                count++;
            }
        }
        System.out.println("Intersection Set : " + intersec_set);
        
        System.out.println("size of Intersection set: " + count);

    }   

    public static void main(String args[]) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}