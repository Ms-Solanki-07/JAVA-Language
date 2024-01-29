import java.util.Scanner;

public class Recursion01{

    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumber(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        printNumber(n);
    } 
}