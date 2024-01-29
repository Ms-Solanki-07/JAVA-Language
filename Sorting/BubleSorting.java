// Bubble sorting 

import java.util.*;
public class BubleSorting{
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.print("Enter Input:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("sorting:");
        printarr(arr);

    }
}