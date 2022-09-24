public class Stacknode {    
  //Represent a node of the singly linked list    
  class Node{    
      String data;    
      Node next;    
          
      public Node(String data) {    
          this.data = data;    
          this.next = null;    
      }    
  }    
   
 //This is the head
  public Node head = null;   
//Makes a new nodee
  public void addNode(String data) {
    Node newNode = new Node(data);    
  
//if the stack is empty, make it not empty 
    if (head == null){
      head = newNode;
    }
  }
  public void display(){
    Node current = head;
  
  if (head == null){
    System.out.println("List is Empty");
    return;
  }

  System.out.println("Nodes of singly linked list: ");    
  while(current != null) {    
      //Prints each node by incrementing pointer    
      System.out.print(current.data + " ");    
      current = current.next;    
  }    
  System.out.println();    
  }    

public static void main(String[] args) {    
      
  Stacknode sList = new Stacknode();    
      
  //Add nodes to the list    
  sList.addNode("test1");    
  sList.addNode("test2");    
  sList.addNode("test3");    
  sList.addNode("test4");    
      
  //Displays the nodes present in the list    
  sList.display();    
}    
}
  