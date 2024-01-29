// remove duplicate form string

public class Recursion12 {
    public static boolean map[] = new  boolean[26];

    public static void removeduplicate(String str, int idx, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
        }
        char curr = str.charAt(idx);

        if(map[curr-'a'] == true){
            removeduplicate(str, idx+1, newstr);
        } else {
            newstr += curr;
            map[curr-'a'] = true;
            removeduplicate(str, idx+1, newstr);
        }
    }
    public static void main(String args[]) {
       String str = "abbccda";
       removeduplicate(str, 0, ""); 
    }
}