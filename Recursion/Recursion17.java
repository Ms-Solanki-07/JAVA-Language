// count the total paths in a maze to move form (0,0) to (n,m)
public class Recursion17 {
    public static int paths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        // move downward
        int downward = paths(i+1, j, n, m);
        // move right
        int right = paths(i, j+1, n, m);
        return downward + right;
    }
    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        int totalpaths = paths(0, 0, n, m);
        System.out.println("total path : "+ totalpaths);
    }
}