
// Scratch LinkedList Implemention
public class LinkedList01{
    Node head;
    private int size;

    LinkedList01(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("list is Empty!");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("list is Empty, Nothing to delet!");
        }
        size--;
        if(head == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public void addInMiddel(int index, String data){
        if(index > size || index < 0){
            System.out.println("Invalid Index value!");
            return;
        }
        size++;
        
        Node newNode = new Node(data);
        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        
        for(int i=1; i<size; i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }

    }

    public void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize(){
        return size;
    }

    // reverse of list by using iteration(looping)
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // reverse of list by using Recursion
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }
    

    public static void main(String args[]){
        LinkedList01 list = new LinkedList01();
        
        list.addFirst("is");
        list.addFirst("this");
        // list.printList();
        list.addLast("list");
        // list.printList();
        // list.removeFirst();
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        // list.addFirst("is");
        // list.addFirst("this");
        // list.addLast("list");
        // list.printList();
        // list.addInMiddel(1, "ms");
        // list.printList();
        // System.out.println("size:" + list.getSize());

        // list.addFirst("1");
        // list.addLast("2");
        // list.addLast("3");
        // list.addLast("4");
        // list.printList();
        // list.reverseList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
       
    }
}



