package SinglyLinkedList;

public class Node {
    int data;
    Node next;
    public Node(int data , Node next){
        this.data=data;
        this.next=next;
    }

    public Node(int data){
        this.data=data;
        next=null;
    }
}

class SinglyLinkedList{

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        int []arr = {10,1,2,3};
        Node head = singlyLinkedList.convertArrayToLinkedList(arr);
        System.out.println(head.data);
        singlyLinkedList.traverseToLinkedList(head);
        System.out.println();
        int len = singlyLinkedList.findLengthOfLinkedList(head);
        System.out.println("length :" + len);
    }

    public void traverseToLinkedList(Node node){
        Node temp = node;
        while (temp != null){
            System.out.print(temp.data+" - ");
            temp = temp.next;
        }
    }

    public int findLengthOfLinkedList(Node node){
        int len = 0;
        Node temp = node;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    Node convertArrayToLinkedList(int []arr){
        // lets start with head which will contain the firstelement
        Node head = new Node(arr[0]);
        // we want a mover which will keep track of next pointer , initially it starts with head
        Node mover = head;
        for (int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]); // creating a new node
            mover.next = temp; // linking previos node to this current node
            mover = mover.next; // moving the pointer ahead

        }
        return head;
    }
}
