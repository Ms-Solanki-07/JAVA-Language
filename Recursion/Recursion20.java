// print all the subsets of a set of first n natural numbers.

import java.util.*;
public class Recursion20 {
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
          System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printsubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findsubsets(n-1, subset);
        // add nhi hoga
        subset.remove(subset.size()-1);
        findsubsets(n-1, subset);
    }
    
    public static void main(String args[]){
        int n=4;
        ArrayList<Integer> subset = new ArrayList<> ();
        findsubsets(n, subset);
        
    } 
}