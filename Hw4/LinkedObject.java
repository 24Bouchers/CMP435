public class LinkedObject {
    Vertex head;

    public void addVertex(int data){
        Vertex vertex = new Vertex();
        vertex.id = data;
        vertex.next = null;

        if (head ==null){
            head = vertex;
        } else {
            Vertex v = head;
            while(v.next !=null){
                v = v.next;
            }
            v.next = vertex;
        }
    }

    public void show(){
        Vertex vertex = head;
    while(vertex.next != null){
        System.out.println(vertex.id);
        vertex = vertex.next;
    }
    System.out.println(vertex.id);

    }
/* 
    public void addEdge1(int v1, int v2){
        Vertex vertex = head;
        while( vertex.id != v1){
            vertex = vertex.next;
        }
        vertex.neighbors.next =
        
    }
*/
    public int index(int num){
        int indexNum = 0;
        for(int i = 0; i < num; i++){
        indexNum ++;
    }
    return indexNum;
}
}

