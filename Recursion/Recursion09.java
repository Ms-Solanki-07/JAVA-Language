// first and last occurance of an elment in string.

import java.util.*;

public class Recursion09 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if(idx == str.length()-1) {
            System.out.println("first : " + first);
            System.out.println("last : " + last);
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
                last = first;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);

    }
    public static void main(String args[]) {
        String str = "abaacdeaefaah";
        findOccurance(str, 0, 'e');
    }
}