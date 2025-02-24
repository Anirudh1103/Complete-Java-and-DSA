public class SLLImplementation {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        sll.insertEnd(4);
        sll.insertPosition(333,2);
        sll.display();
    }
}
