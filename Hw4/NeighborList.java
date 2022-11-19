public class NeighborList {
    Node head;
    

    public void Ninsert(Object Node, int vertex) {
        Node node = new Node();
        node.vertex = vertex;
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

    public void Nshow() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.vertex + ", ");
            node = node.next;
        }
        System.out.print(node.vertex);

    }

    public void NMatrixList(int length) {
        Node node = head;
        System.out.print("[");
        for (int i = 1; i < length+1; i++) {
            if (i == node.vertex) {
                System.out.print(1 + " ");
                if(node.next == null){
                    i++;
                } else{
                    node = node.next;
                    
                }
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.print("]");
    }

    public int Nindex() {
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
