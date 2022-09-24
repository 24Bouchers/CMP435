public class Stacknode {
  // Represent a node of the singly linked list
  class Node {
    String data;
    Node next;

    public Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  // Start of the Node
  public Node head = null;
  public Node tail = null;

  // this is the part actually making it
  public void push(String data) {
    // Create a new node
    Node newNode = new Node(data);

    // if the stack is empty, make it not empty
    if (head == null) {

      head = newNode;
      tail = newNode;
    } else {
      // newNode will be added after tail such that tail's next will point to newNode
      tail.next = newNode;
      // newNode will become new tail of the list
      tail = newNode;

    }
  }

  // Checks to see if the stack/queue is empty
  public void isEmpty() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
  }
// Getting really close with this pop function, just need to figure out how to go back 1 from the tail
  public void pop() {
    if (tail != null) {
      
      tail  = null;
      System.out.println("pop!");
    } else {
      System.out.println("Cant pop if there's nothing in there!");
    }
  }


  /* */
  // display() will display all the nodes present in the list
  public void display() {
    // Node current will point to head
    Node current = head;

    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    while (current != null) {
      // Prints each node by incrementing pointer
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    Stacknode sList = new Stacknode();

    // This will become letters for magic items hopefully within the next hour

    // Displays the nodes present in the list sList.push("1");
    sList.push("2");
    sList.push("3");
    sList.push("4");
    sList.push("5");
    sList.pop();
    sList.display();
  }
}