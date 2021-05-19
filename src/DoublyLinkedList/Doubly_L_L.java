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

    public void inserAtEnd(int data) {
        Node nainode = new Node(data);
        if (head == null) {
            head = tail = nainode;
        } else {
            tail.next = nainode;
            nainode = tail;
            tail = nainode;
        }
    }
}

