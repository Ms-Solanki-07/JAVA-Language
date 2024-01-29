// sum of first natural number

import java.util.*;

public class Recursion02 {
    public static void printsum(int i, int n, int sum){
        if(i == n){
            sum = sum + i;
            System.out.println("sum : " + sum);
            return;
        }
        sum = sum + i;
        printsum(i+1, n, sum);
    }
    public static void main(String args[]) {
        int n = 5;
        printsum(1, n, 0);
    }
}