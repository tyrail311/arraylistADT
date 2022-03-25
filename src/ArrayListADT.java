public class ArrayListADT {
    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public ArrayListADT() {
        head = null;
        size = 0;
    }

    private Node head;
    private Node tail;
    public int size;

    public void addFirst(int number) {
        if (head == null) {
            head = new Node(number, null);
            tail = head;
            tail.next = head;
        } else {
            Node newNode = new Node(number, head);
            tail.next = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int number) {
        if (head == null) {
            head = new Node(number, null);
            tail = head;
            tail.next = head;
        } else {
            Node newNode = new Node(number, head);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void delete() {
        if (head == null)
            return;
        if (head.next == head) {
            head = null;
            tail = null;
        } else {
            tail.next = head.next;
            head = tail.next;
        }
    }

    public void display() {
        if(head != null)
        {
            Node current = head;
            while(current.next != head)
            {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
}
