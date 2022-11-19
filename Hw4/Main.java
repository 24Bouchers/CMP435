import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    // Part1
    //graph1Operations();

    // Part2
    loadTree();
    //StuffCheck(InventorySearch(FileReader()));

    
  }

  public static void loadTree() throws FileNotFoundException{
    String[] magicalArray = FileReader();
    BST inventory = new BST();
    Component head = null;
    head = inventory.insert(head, magicalArray[0]);
    for(int i =1; i < magicalArray.length; i++){
      inventory.insert(head, magicalArray[i]);
      System.out.println("");
    }
    inventory.printInorder(head);

    for(int i =0; i < InventorySearch(FileReader()).length; i++){
      inventory.LocateItem(head, InventorySearch(magicalArray)[i]);
    }
  }






  public static void graph1Operations() {
    System.out.println("undirected 7-vertex 11-edge");
    Seven11().adjacencyList();
    Seven11().MatrixList();
    Seven11().runDFS();
    System.out.println("undirected 8-Vertex Full");
    Full8().adjacencyList();
    Full8().MatrixList();
    System.out.println("undirected 63-Vertex Tree (branch factor = 2)");
    Factor64().adjacencyList();
    Factor64().MatrixList();
    System.out.println("undirected 64-Vertex 72-Edge Erdos-Renyi Random");
    Random72().adjacencyList();
    Random72().MatrixList();
    System.out.println("undirected Zork Map (ground level) w/ 3 disconnected components");
    Zork().adjacencyList();
    Zork().MatrixList();
  }

  public static Graph Seven11() {
    Graph seven11 = new Graph();
    for (int i = 1; i < 8; i++) {
      seven11.insert(i);
    }
    seven11.edge(1, 2);
    seven11.edge(1, 5);
    seven11.edge(1, 6);
    seven11.edge(2, 3);
    seven11.edge(2, 5);
    seven11.edge(2, 6);
    seven11.edge(3, 4);
    seven11.edge(4, 5);
    seven11.edge(5, 6);
    seven11.edge(5, 7);
    seven11.edge(6, 7);
    return seven11;
  }

  public static Graph Full8() {
    Graph full8 = new Graph();
    for (int i = 1; i < 9; i++) {
      full8.insert(i);
    }
    full8.edge(2, 1);
    full8.edge(3, 1);
    full8.edge(4, 1);
    full8.edge(5, 1);
    full8.edge(6, 1);
    full8.edge(7, 1);
    full8.edge(8, 1);
    full8.edge(3, 2);
    full8.edge(4, 2);
    full8.edge(5, 2);
    full8.edge(6, 2);
    full8.edge(7, 2);
    full8.edge(8, 2);
    full8.edge(4, 3);
    full8.edge(5, 3);
    full8.edge(6, 3);
    full8.edge(7, 3);
    full8.edge(8, 3);
    full8.edge(5, 4);
    full8.edge(6, 4);
    full8.edge(7, 4);
    full8.edge(8, 4);
    full8.edge(6, 5);
    full8.edge(7, 5);
    full8.edge(8, 5);
    full8.edge(7, 6);
    full8.edge(8, 6);
    full8.edge(8, 7);
    return full8;
  }

  public static Graph Factor64() {
    Graph factor64 = new Graph();
    for (int i = 1; i < 64; i++) {
      factor64.insert(i);
    }
    factor64.edge(2, 1);
    factor64.edge(3, 1);
    factor64.edge(4, 2);
    factor64.edge(5, 2);
    factor64.edge(6, 3);
    factor64.edge(7, 3);
    factor64.edge(8, 4);
    factor64.edge(9, 4);
    factor64.edge(10, 5);
    factor64.edge(11, 5);
    factor64.edge(12, 6);
    factor64.edge(13, 6);
    factor64.edge(14, 7);
    factor64.edge(15, 7);
    factor64.edge(16, 8);
    factor64.edge(17, 8);
    factor64.edge(18, 9);
    factor64.edge(19, 9);
    factor64.edge(20, 10);
    factor64.edge(21, 10);
    factor64.edge(22, 11);
    factor64.edge(23, 12);
    factor64.edge(24, 12);
    factor64.edge(25, 12);
    factor64.edge(26, 13);
    factor64.edge(27, 13);
    factor64.edge(28, 14);
    factor64.edge(29, 14);
    factor64.edge(30, 15);
    factor64.edge(31, 15);
    factor64.edge(32, 16);
    factor64.edge(33, 16);
    factor64.edge(34, 17);
    factor64.edge(35, 17);
    factor64.edge(36, 18);
    factor64.edge(37, 18);
    factor64.edge(38, 19);
    factor64.edge(39, 19);
    factor64.edge(40, 20);
    factor64.edge(41, 20);
    factor64.edge(42, 21);
    factor64.edge(43, 21);
    factor64.edge(44, 22);
    factor64.edge(45, 22);
    factor64.edge(46, 23);
    factor64.edge(47, 24);
    factor64.edge(48, 24);
    factor64.edge(49, 24);
    factor64.edge(50, 25);
    factor64.edge(51, 25);
    factor64.edge(52, 26);
    factor64.edge(53, 26);
    factor64.edge(54, 27);
    factor64.edge(55, 27);
    factor64.edge(56, 28);
    factor64.edge(57, 28);
    factor64.edge(58, 29);
    factor64.edge(59, 29);
    factor64.edge(60, 30);
    factor64.edge(61, 30);
    factor64.edge(62, 31);
    factor64.edge(63, 31);
    return factor64;
  }

  public static Graph Random72() {
    Graph random72 = new Graph();
    for (int i = 1; i <= 64; i++) {
      random72.insert(i);
    }
    random72.edge(5, 2);
    random72.edge(11, 1);
    random72.edge(12, 5);
    random72.edge(13, 12);
    random72.edge(14, 3);
    random72.edge(14, 5);
    random72.edge(16,1);
    random72.edge(17, 6);
    random72.edge(18, 11);
    random72.edge(18, 12);
    random72.edge(20, 2);
    random72.edge(20, 7);
    random72.edge(24, 6);
    random72.edge(28, 25);
    random72.edge(29, 11);
    random72.edge(29, 16);
    random72.edge(30, 10);
    random72.edge(31,25);
    random72.edge(34, 2);
    random72.edge(35, 2);
    random72.edge(35, 30);
    random72.edge(36, 7);
    random72.edge(37, 19);
    random72.edge(38, 1);
    random72.edge(38, 5);
    random72.edge(41, 35);
    random72.edge(42, 6);
    random72.edge(42, 34);
    random72.edge(42, 38);
    random72.edge(42, 40);
    random72.edge(43, 17);
    random72.edge(43, 26);
    random72.edge(46, 5);
    random72.edge(46, 27);
    random72.edge(46, 28);
    random72.edge(47, 31);
    random72.edge(47, 38);
    random72.edge(48, 2);
    random72.edge(48, 6);
    random72.edge(48, 13);
    random72.edge(48, 26);
    random72.edge(48, 42);
    random72.edge(49, 11);
    random72.edge(49, 19);
    random72.edge(50, 8);
    random72.edge(50, 14);
    random72.edge(50, 27);
    random72.edge(51, 36);
    random72.edge(51, 2);
    random72.edge(52, 28);
    random72.edge(53, 41);
    random72.edge(53, 4);
    random72.edge(54, 2);
    random72.edge(55, 45);
    random72.edge(56, 18);
    random72.edge(57, 49);
    random72.edge(58, 25);
    random72.edge(59, 52);
    random72.edge(60, 23);
    random72.edge(60, 31);
    random72.edge(60, 37);
    random72.edge(60, 40);
    random72.edge(61, 20);
    random72.edge(61, 28);
    random72.edge(61, 31);
    random72.edge(61, 58);
    random72.edge(62, 3);
    random72.edge(62, 4);
    random72.edge(62, 5);
    random72.edge(63, 38);
    random72.edge(64, 40);
    return random72;
  }

  public static Graph Zork() {
    Graph zork = new Graph();
    for (int i = 0; i <= 20; i++) {
      zork.insert(i);
    }
    zork.edge(0,1);
    zork.edge(0,3);
    zork.edge(0,13);
    zork.edge(1,2);
    zork.edge(1,14);
    zork.edge(2,3);
    zork.edge(2,7);
    zork.edge(3,12);
    zork.edge(4,5);
    zork.edge(4,6);
    zork.edge(7,8);
    zork.edge(7,12);
    zork.edge(7,17);
    zork.edge(8,12);
    zork.edge(8,9);
    zork.edge(9,11);
    zork.edge(10,13);
    zork.edge(12,14);
    zork.edge(13,15);
    zork.edge(13,15);
    zork.edge(14,15);
    zork.edge(14,16);
    zork.edge(15,17);
    zork.edge(17,18);
    zork.edge(19,20);
    return zork;
  }


  public static String[] FileReader() throws FileNotFoundException {
    int fileSize = 0;
    String magicalArray[];
    String item = "";
    int c = 0;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc0 = new Scanner(file);
    // Find the Ammount of Lines in the file
    while (sc0.hasNextLine()) {
      sc0.nextLine();
      fileSize++;
    }
    sc0.close();
    magicalArray = new String[fileSize];
    Scanner sc1 = new Scanner(file);
    // Array Filler
    while (sc1.hasNextLine()) {
      item = sc1.nextLine();
      magicalArray[c] = item;
      c++;
    }
    sc1.close();
    return magicalArray;
  }

  public static String[] InventorySearch(String[] magicalArray) throws FileNotFoundException {
    int fileSize = 0;
    String listToFind[];
    String item = "";
    int c = 0;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw4\\magicitems-find-in-bst.txt");
    Scanner sc0 = new Scanner(file);
    // Find the Ammount of Lines in the file
    while (sc0.hasNextLine()) {
      sc0.nextLine();
      fileSize++;
    }
    sc0.close();
    listToFind = new String[fileSize];
    Scanner sc2 = new Scanner(file);
    // Array Filler
    while (sc2.hasNextLine()) {
      item = sc2.nextLine();
      listToFind[c] = item;
      c++;
    }
    sc2.close();
    return listToFind;
  }

  public static void InventoryCheck(String[] magicalArray) {
    for (int i = 0; i < magicalArray.length; i++) {
      System.out.println(magicalArray[i]);
    }
  }
  public static void StuffCheck(String[] listToFind) {
    for (int i = 0; i < listToFind.length; i++) {
      System.out.println(listToFind[i]);
    }
  }


}
