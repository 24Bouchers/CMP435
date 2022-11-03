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

    QuickSort(magicalArray, 0, (magicalArray.length - 1));
    // LinearSearch(magicalArray);
    BinarySearch(magicalArray);
    /*
     * Compare to test
     * for (int i = 0; i < 666; i++) {
     * 
     * int check = magicalArray[i].compareTo(magicalArray[magicalArray.length/2]);
     * if (check < 0) {
     * System.out.println("Neg");
     * }
     * if (check > 0) {
     * System.out.println("Positive");
     * }
     * if (check == 0){
     * System.out.println("Found it");
     * }
     * }
     */
  }

  public static void LinearSearch(String[] magicalArray) {

    int total = 0;
    // This is set up for how many items were locating
    for (int i = 0; i < 42; i++) {
      int random_int = (int) Math.floor(Math.random() * (666 - 0 + 1));
      String magicItem = magicalArray[random_int];
      // Counter Counts the ammount of comparisons each item makes
      int counter = 0;
      boolean found = false;
      // Looks for the item
      while (found != true) {
        counter++;
        if (magicItem == magicalArray[counter]) {
          found = true;
          total = total + counter;
        }
      }
    }
    System.out.println(total + " Total Comparisons");
  }

  public static void BinarySearch(String[] magicalArray) {
        String magicItem = magicalArray[42];
        int lp = 0;
        int hp = magicalArray.length - 1;
        
        while(lp < hp) {
          int mp = (lp + hp) / 2;
          if(42 == mp){
            System.out.println("Yay" + magicItem);
          } else if (magicItem.compareTo(magicalArray[mp]) > 0){
            hp = mp - 1;
            System.out.println(magicItem.compareTo(magicalArray[mp]));
          } else {
            lp = mp - 1;
           System.out.println(magicItem.compareTo(magicalArray[mp]));
          }
        }

        }

  private static void QuickSort(String[] magicalArray, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {

      return;
    }

    int pivotIndex = (int) Math.floor(Math.random() * (666));
    String pivot = magicalArray[pivotIndex];
    swap(magicalArray, pivotIndex, highIndex);

    int leftPointer = partition(magicalArray, lowIndex, highIndex, pivot);
    QuickSort(magicalArray, lowIndex, leftPointer - 1);
    QuickSort(magicalArray, leftPointer + 1, highIndex);

  }

  private static int partition(String[] magicalArray, int lowIndex, int highIndex, String pivot) {
    int lp = lowIndex;
    int rp = highIndex - 1;

    while (lp < rp) {

      // Walk from the left until we find a number greater than the pivot, or hit the
      // right pointer.
      while ((magicalArray[lp].compareToIgnoreCase(magicalArray[highIndex]) < 0) && lp < rp) {
        lp++;
      }

      // Walk from the right until we find a number less than the pivot, or hit the
      // left pointer.
      while ((magicalArray[lp].compareToIgnoreCase(magicalArray[highIndex]) < 0) && lp > rp) {
        rp--;
      }

      swap(magicalArray, lp, rp);
      lp++;
    }

    if ((magicalArray[lp].compareToIgnoreCase(magicalArray[highIndex]) < 0) && lp > rp) {
      swap(magicalArray, lp, highIndex);
    } else {
      lp = highIndex;
    }

    return lp;
  }

  public static void swap(String[] magicalArray, int index1, int index2) {
    String temp = magicalArray[index1];
    magicalArray[index1] = magicalArray[index2];
    magicalArray[index2] = temp;
  }
}
