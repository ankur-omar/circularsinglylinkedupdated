class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class circularLinked {
    Node start;

    public boolean isEmpty() {
        return start == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return;
        } else {
            Node temp;
            temp = start;
            while (temp.getNext() != start) {
                System.out.println(temp.getData()+" ");
                temp=temp.getNext();
            }
            temp = temp.getNext();
            System.out.println(temp.getData());

        }
    }

    public void insertend(int data) {
        Node n = new Node();
        n.setData(data);
        if (isEmpty()) {
            start = n;
            n.setNext(n);

        } else {
            Node temp = start;
            while (temp.getNext() != start) {
                temp = temp.getNext();
            }
            temp.setNext(n);
            n.setNext(start);
        }
    }

    public void insertfirst(int data) {
        Node n = new Node();
        n.setData(data);
        if (isEmpty()) {
            start = n;
            n.setNext(n);
        } else {
            Node temp = start;
            while (temp.getNext() != start) {
                temp = temp.getNext();

            }
            temp.setNext(n);
            n.setNext(start);
            start = n;
        }
    }

    public void deleteatfirst() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return;
        } else {
            Node temp;
            temp = start;
            start = start.getNext();
            temp.setNext(start);
        }
    }

    public void deleteatlast() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return;
        } else {
            Node previous;
            Node temp = start;
            while (temp.getNext() != start) {
                previous = temp;
                temp = temp.getNext();

            }
            temp.setNext(start);
        }
    }

    public static void main(String[] args) {
        circularLinked obj = new circularLinked();
        obj.insertfirst(10);
        obj.insertfirst(20);
        obj.insertfirst(30);
        obj.insertfirst(40);
        obj.display();
        obj.deleteatfirst();
        obj.display();



    }
}
