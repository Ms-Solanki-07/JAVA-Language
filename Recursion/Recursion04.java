import java.util.*;

public class Recursion04 {
    public static void fibonaci(int a, int b, int n){
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonaci(b, c, n-1);
    }
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 9;

        System.out.print(a + " ");
        System.out.print(b + " ");

        fibonaci(a, b, n-2);
    }
}