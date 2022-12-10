public class Graph {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.vertex = data;
        node.edge = new Edge();
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

    public void adjacencyList() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.vertex + "[");
            node.edge.ShowEdges();
            System.out.print("]");
            node = node.next;
            System.out.println("");
        }
        System.out.print(node.vertex + "[");
        node.edge.ShowEdges();
        System.out.print("]");
    }

    public void SSSP() {
        Node node = head;
        if ( node != null) {
            while (node.next != null) {
                node = node.next;
            }
        }
    }


    public void edge(int v1, int v2, int weight) {
        Node node = head;
        while (node.vertex != v1) {
            node = node.next;
        }
        Node firstPoint = node;
        node = head;
        while (node.vertex != v2) {
            node = node.next;
        }

        Node secondPoint = node;
        firstPoint.edge.Edgeinsert(secondPoint, v2, weight);

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
