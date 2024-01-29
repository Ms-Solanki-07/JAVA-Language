// check an array strictly sorted

import java.util.*;

public class Recursion10 {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] < arr[idx + 1]){
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,3,4,4};

        System.out.println("sorted : " + isSorted(arr, 0));
    }
}