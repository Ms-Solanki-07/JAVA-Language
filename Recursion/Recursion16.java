// print permutation of string

public class Recursion16 {
    public static void printperm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printperm(newstr, permutation + curr);
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        printperm(str,"");
    }
}