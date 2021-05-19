package DoublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    Node(int d){
        data= d;
        next=prev=null;
    }
}
