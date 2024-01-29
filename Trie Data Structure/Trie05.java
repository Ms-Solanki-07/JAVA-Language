// Question - longest word with all prefixes
// find the longest string in words such that every prefix of it is also in words

// Somethings error in output


public class Trie05 {
    static class Node {
        Node[] children;
        boolean eow;
        
        public Node() {
            children = new Node[26];  // a to z
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {   // O(L)
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for(int i=0; i<key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                temp.append((char)(i + 'a'));   // typecast
                if(temp.length() > ans.length()) {
                    ans = temp.toString();  // string builder ko direct string me assign nhi kr skte, esliye toString() function ka use kiya hai
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]){
        String words[] = {"a", "banana", "app", "appl", "apply", "apple"};
        for(int i = 0; i<words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println("longest word with all preffx : " + ans);
        
    }
}