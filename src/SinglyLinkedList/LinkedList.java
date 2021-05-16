package SinglyLinkedList;

public class LinkedList {
    public Node head;
    public LinkedList() {
        this.head = null;
    }
    /* insert at begniing */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    /*
     insert at the end  method
     */
    public void insertAtend(int data)
    {
        Node Newnode = new Node(data);
        if (head == null) {
            head = Newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = Newnode;
        }
    }
    // print method
    public void printList() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.Data + "->");
                temp = temp.next;
            }
        }
    }
    public void inserAtEnd(int data){
        Node NewNode = new Node(data);
        if (head == null ){
            head = NewNode;
        }
        else {
            Node Temp = head;
            while (Temp.next!= null){
                Temp=Temp.next;
            }
            Temp.next  = NewNode;
        }
    }

    public void deletAtEnd(int data)
        {
         Node DeletNode = new Node(data);
         if (head == null){
             System.out.println("Empty");
         }
         else {
             Node temP = head;
             while (temP.next.next!=null){
                 temP=temP.next;

             }
             temP.next=null;
         }
        }
}
