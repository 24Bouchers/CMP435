public class Graph {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.vertex = data;
        node.neighbors = new NeighborList();
        node.next = null;
        node.proccessed = false;

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
            node.neighbors.Nshow();
            System.out.print("]");
            node = node.next;
            System.out.println("");
        }
        System.out.print(node.vertex + "[");
        node.neighbors.Nshow();
        System.out.print("]");
    }

    public void MatrixList() {
        Node node = head;
        int length = Index();
        System.out.println("");
        System.out.println("Matrix: ");
        while (node.next != null) {
            if (node.neighbors != null) {
                node.neighbors.NMatrixList(length);
                System.out.println(" ");
                node = node.next;
            }
        }
    }

    public void edge(int v1, int v2) {
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

        firstPoint.neighbors.Ninsert(secondPoint, v2);
        secondPoint.neighbors.Ninsert(firstPoint, v1);

    }

    public void runDFS() {
        DFS(head);
    }

    public void DFS(Node node) {
        if (node.proccessed == false) {
            System.out.println(node.vertex);
            node.proccessed = true;
        }
        for (int i = 1; i < node.neighbors.Nindex(); i++) {

            if (node.proccessed == false) {
                DFS(node);
            }
        }
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
