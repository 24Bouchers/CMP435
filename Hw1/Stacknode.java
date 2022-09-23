public class Stacknode {
//Data Types
    public String letter;
    private Stacknode next;
//Constructor    
    public Stacknode(String data) {
      this.letter = data;
      this.next = null;
    }
 //makes a new node 
    public void setNextNode(Stacknode node) {
      this.next = node;
    }
 //obtain information on the next node 
    public Stacknode getNextNode() {
      return this.next;
    }
  }