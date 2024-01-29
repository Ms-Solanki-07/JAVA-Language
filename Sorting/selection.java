// Selection sorting
import java.util.*;
public class selection {    
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter: ");
        int arr[]= new int[6];
        // input
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        // sorting
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
        System.out.println("Sorting");
        printarr(arr);
    }
}
