// find the number of ways in which you can invite n people to your party, single or in pairs

public class Recursion19 {
    public static int callGuest(int n){
        if(n<=1) {
            return 1;
        }

        // single
        int ways1 = callGuest(n-1);
        // pair
        int ways2 = (n-1) * callGuest(n-2);

        return ways1 + ways2;
    }
    public static void main(String args[]) {
        int n = 4;

        System.out.println(callGuest(n));
    }
}