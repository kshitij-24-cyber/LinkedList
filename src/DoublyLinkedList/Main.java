package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Doubly_L_L list = new Doubly_L_L();
        list.inserAtBeg(10);
        list.inserAtBeg(20);
        list.inserAtBeg(30);
        list.inserAtBeg(40);
        list.inserAtBeg(50);

        list.inserAtEnd(55);
        list.inserAtBeg(69);
        list.printlist();
    }
}
