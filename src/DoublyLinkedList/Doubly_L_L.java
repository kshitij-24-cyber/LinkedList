package DoublyLinkedList;

public class Doubly_L_L {
    Node head;
    Node tail;

    public Doubly_L_L() {
        this.head = null;
    }

    public void inserAtBeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

    }

    public void printlist() {
        if (head == null) {
            System.out.println("Empty");

        } else {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }

        }
    }

    public void insertAtEnd(int data) {
        Node nainode = new Node(data);
        Node temp = new Node(data);
        if (head == null) {
            head = tail = nainode;
        } else {
            tail.next = nainode;
            nainode.prev= tail;
            tail.next= nainode;
            tail = nainode;
        }

    }


    public void DeletAtbeg(int data){
        Node thisNode = new Node(data);
        if (head==null){
            thisNode=null;

        }
        if (head.next==null){
            thisNode=null;
        }
        else{
            head=head.next;
            head.prev = null;
            thisNode=head;
        }
    }
}


