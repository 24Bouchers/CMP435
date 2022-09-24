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
   
  //Start of the Node  
  public Node head = null;    
 //this is the part actually making it
  public void addNode(String data) {    
      //Create a new node    
      Node newNode = new Node(data);    
          
//if the stack is empty, make it not empty 
      if(head == null) {    

          head = newNode;     
      }    

  }    
      
  //display() will display all the nodes present in the list    
  public void display() {    
      //Node current will point to head    
      Node current = head;    
          
      if(head == null) {    
          System.out.println("List is empty");    
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
          
  //This will become letters for magic items hopefully within the next hour  
      sList.addNode("1");    
      sList.addNode("2");    
      sList.addNode("3");    
      sList.addNode("4");    
          
      //Displays the nodes present in the list    
      sList.display();    
  }    
}    