public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.vertex = data;
        node.neighbors = new LinkedList();
        node.next = null;

        if (head ==null){
            head = node;
        } else {
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertNeighbor(Object Node){
        Node node = new Node();
        node.neighbors = new LinkedList();
        node.next = null;

        if (head ==null){
            head = node;
        } else {
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
    Node node = head;
    while(node.next != null){
        System.out.println(node.vertex);
        node = node.next;
    }
    System.out.println(node.vertex);

    }
    public void showNeighbors(){
        Node node = head;
        Node neighbors = head;
        while(node.next != null){
            System.out.println(node.vertex);
            while(neighbors.next != null){
                System.out.println(node.vertex);
                neighbors = neighbors.next;
        }
        node = node.next;
    }
        System.out.println(node.vertex);
    
        }

    public void addEdge(int v1 , int v2){
        Node node = head;
        while(node.vertex != v1){
            node = node.next;
        }
        Node firstPoint = node;
        node = head;
        while(node.vertex != v2){
            node = node.next;
        }
        
        Node secondPoint = node;

        firstPoint.neighbors.insertNeighbor(secondPoint);
        secondPoint.neighbors.insertNeighbor(firstPoint);
    }

}


