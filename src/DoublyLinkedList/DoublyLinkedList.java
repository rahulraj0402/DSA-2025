package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;

    // insert at beginning
    public void insertBeginning(int data){
        Node newNode = new Node(data);
        if (head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // print from start
    public void printFormStart(){
        Node temp = head; // point to head
        while (temp != null){
            System.out.print(temp.data + "< - > ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
