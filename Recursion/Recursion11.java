// move all x to the end of the string

import java.util.*;

public class Recursion11 {
    public static void moveAllx(String str, int idx, int count, String newstr){
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
    
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            moveAllx(str, idx+1, count, newstr);
        } else {
            newstr += curr;
            moveAllx(str, idx+1, count, newstr);
        }
    }

    public static void main(String args[]) {
        String str = "axbxxcxxd";

        moveAllx(str, 0, 0, "");
    }
}