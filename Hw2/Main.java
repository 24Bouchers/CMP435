import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    // Var Declerations
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
    // set the unmagicalArray size to the size of the file
    magicalArray = new String[fileSize];
    // Fill that array
    Scanner sc1 = new Scanner(file);
    while (sc1.hasNextLine()) {
      item = sc1.nextLine();
      magicalArray[c] = item;

      c++;
    }
    sc1.close();
    SelectionSort(magicalArray);
    Shuffle(magicalArray);
    // InsertionSort(magicalArray);
  }

  public static void Shuffle(String[] magicalArray) throws FileNotFoundException {
    String temp[];
    temp = new String[2];
    temp[1] = null;
    for (int i = 0; i < magicalArray.length; i++) {
      // Swaps i spot in the ray with a random spot in the array
      int random_int = (int) Math.floor(Math.random() * (magicalArray.length));
      temp[1] = magicalArray[random_int];
      magicalArray[random_int] = magicalArray[i];
      magicalArray[i] = temp[1];
    }
  }

  public static void SelectionSort(String[] magicalArray) throws FileNotFoundException {
    // Set up some basic information
    int comparisons = 0;
    String temp[];
    temp = new String[2];
    temp[1] = null;
    // This is the r
    for (int a = 0; a < magicalArray.length; a++) {
      // this will find select the frist element in the arayy
      for (int i = 0; i < magicalArray.length; i++) {
        String compareOne = magicalArray[i].toString();
        // and compare it to each item in the list
        for (int j = 0; j < magicalArray.length; j++) {
          String compareTwo = magicalArray[j].toString();
          int check = compareOne.compareToIgnoreCase(compareTwo);
          comparisons++;
          // If there is a value greater, it will swap each number
          if (check < 0) {
            temp[1] = magicalArray[i];
            magicalArray[i] = magicalArray[j];
            magicalArray[j] = temp[1];
          }
        }
      }
    }
    System.out.print(comparisons);
    // This is just my test to visually see if it sorts

    for (int i = 0; i < magicalArray.length; i++) {
      System.out.print(magicalArray[i]);
      System.out.print(" ");
      System.out.print("|");
    }

  }

  /*
   * public static void InsertionSort(String[] magicalArray) throws
   * FileNotFoundException {
   * int comparisons = 0;
   * int basecheck = 0;
   * int MagicValue[];
   * MagicValue = new int[magicalArray.length];
   * for (int i = 0; i < magicalArray.length; i++) {
   * 
   * }
   */
  /*
   * void merge(String[] magicalArray) {
   * int size = magicalArray.length;
   * int mid = (1 + size) % 2;
   * int lefthand = 0;
   * int righthand = 0;
   * while (size > 2){
   * 
   * if (mid != 0) {
   * lefthand = size / 2;
   * righthand = (size / 2) + (mid);
   * } else {
   * lefthand = size / 2;
   * righthand = lefthand;
   * String temp[];
   * temp = new String[2];
   * temp[1] = null;
   * }
   * }
   */
  /*
   * public static void findMiddle(String[] magicalArray) throws
   * FileNotFoundException {
   * String selection[];
   * selection = new String[3];
   * for(int i = 0; i < magicalArray.length; i++){
   * int random_int = (int) Math.floor(Math.random() * (magicalArray.length));
   * selection[i] = magicalArray[random_int];
   * }
   * 
   * for(int i = 0; i < 3; i++){
   * String base = "A";
   * for(int a = 0; a < selection[i].length(); a++){
   * base = base + "A";
   * }
   * 
   * }
   */
}
