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
    public void insertAtend(int data) {
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

    public void inserAtEnd(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
        } else {
            Node Temp = head;
            while (Temp.next != null) {
                Temp = Temp.next;
            }
            Temp.next = NewNode;
        }
    }

    public void deletAtEnd(int data) {
        Node DeletNode = new Node(data);
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node temP = head;
            while (temP.next.next != null) {
                temP = temP.next;

            }
            temP.next = null;
        }
    }

    public boolean search(int data) {
        Node node = new Node(data);
        if (head == null) {
            return false;
        } else {
            Node TEMP = head;
            while (TEMP != null) {
                if (TEMP.Data == node.Data) {
                    return false;
                }
                TEMP = TEMP.next;
            }
        }
        return false;
    }


    public void insertAtPos(int data, int pos) {
        Node temp = head;
        if (pos == 1) {
            temp.next = head;

        }


        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
            if (curr == null) {

            }
            temp.next = curr.next;
            curr.next=temp;

        }



    }

}


