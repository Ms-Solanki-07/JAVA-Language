// number of wayes of place tiles  of size 1*m in a floor of size n*m

public class Recursion18 {
    public static int placetiles(int n, int m){
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }

        // vertically
        int vertically = placetiles(n-m, m);
        // horizontaly
        int horizontaly = placetiles(n-1, m);

        return vertically + horizontaly;
    }
    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(placetiles(n,m));
    }
}