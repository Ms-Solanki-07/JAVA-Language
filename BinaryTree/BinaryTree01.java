import java.util.*;
public class BinaryTree01{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // preorder treverse
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    // InOrder treverse
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // PostOrder terverse
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    
    // Level Order Traversal
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    // count of Node | by help of recurstion | O(n)
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // Sum of Nodes | O(n)
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum  = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of tree
    public static int heightOftree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOftree(root.left);
        int rightHeight = heightOftree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    // Diameter of Tree | approach 01 - O(n^2)

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOftree(root.left) + heightOftree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // Diameter of tree | approach 02 - O(n)

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }



    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);

        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // levelOrder(root);
        // System.out.println("Nodes : " + countofNodes(root));
        // System.out.println("Sum : " + sumOfNodes(root));
        // System.out.println("Height of tree : "+ heightOftree(root));
        // System.out.println("Diameter of tree : " + diameter(root));
        System.out.println("Diameter of tree(time complexity O(n)): " + diameter2(root).diam);

    }
}