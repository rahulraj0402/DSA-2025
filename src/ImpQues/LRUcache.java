package ImpQues;

import java.util.HashMap;
import java.util.Map;

public class LRUcache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer , Node> map;
    private int capacity;
    private Node head,tail;


    // make a constructor with capacity
    public LRUcache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();

        // create a dummy head and tail
        Node head = new Node(0 , 0);
        Node tail = new Node(0 , 0);
        head.next = tail;
        tail.prev = head;
    }
    // helper function to add the node after HEAD
    private void addAfterHear(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}
