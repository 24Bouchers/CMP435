public class List {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.vertex = data;

        node.next = null;
        node.processed = false;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.vertex + ": ");
            node = node.next;
        }
        System.out.println(node.vertex);
    }

    public int Index() {
        int length = 1;
        Node node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        length++;

        return length;
    }

}
