import java.util.*;

public class Recursion05 {
    public static int calcpower(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int pow_nm1 = calcpower(x, n-1);
        int xpown = x * pow_nm1;
        return xpown;
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 5;

        int ans = calcpower(x, n);

        System.out.println(ans);
    }
}