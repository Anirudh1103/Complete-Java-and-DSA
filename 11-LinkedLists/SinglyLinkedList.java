public class SinglyLinkedList {
    private Node head,tail;
    private int size = 0;
    class Node{
        private int value;
        private Node next;
        //Creating constructors so that when object is created constructor is alos called
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;
        size++;
    }
    public void insertEnd(int value)
    {
        if(tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertPosition(int val, int index)
    {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size){
            insertEnd(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index;i++)
            temp= temp.next;

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void displayReverse()
    {

    }
}
