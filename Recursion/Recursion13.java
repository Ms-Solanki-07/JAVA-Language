// subsequence of string

public class Recursion13 {
    public static void subSequence(String str, int idx, String newstr) {
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char curr = str.charAt(idx);
        // to be 
        subSequence(str, idx+1, newstr+curr);
        // not to be 
        subSequence(str, idx+1, newstr);
    }
    public static void main(String args[]) {
        String str = "abc";
        subSequence(str, 0, "");
    }
}