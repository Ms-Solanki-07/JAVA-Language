// unique subsequence of string

import java.util.HashSet;

public class Recursion14 {
    public static void subSequence(String str, int idx, String newstr, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char curr = str.charAt(idx);
        // to be
        subSequence(str, idx+1, newstr+curr, set);
        // or not to be
        subSequence(str, idx+1, newstr, set);
    }
    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "", set);
    }
}