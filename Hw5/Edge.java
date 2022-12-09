public class Edge {
    Node head;

    public void Edgeinsert(Object Node, int vertex, int weight) {
        Node node = new Node();
        node.vertex = vertex;
        node.next = null;
        node.processed = false;
        node.weight = weight;

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

    public void ShowEdges() {
        Node node = head;
        if (head != null) {

            while (node.next != null) {
                System.out.print(node.vertex + ", ");
                node = node.next;
            }
            System.out.print(node.vertex);
            System.out.print("Weight: " + node.weight);
        }
    }

    public int EdgeIndex() {
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
