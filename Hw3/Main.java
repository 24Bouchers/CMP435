import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    // FUNCTIONS GOES HERE
    LinearSearch(FileReader());
    BinarySearch(FileReader());

    // TESTS
  }

  public static void LinearSearch(String[] magicalArray) {

    int total = 0;
    int numSearches = 42;
    // This is set up for how many items were locating
    for (int i = 0; i < numSearches; i++) {
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
    int average = total / numSearches;
    System.out.println("Linear Search took a total of " + average + " Comparisons");
  }

  public static void BinarySearch(String[] magicalArray) {
    int total = 0;
    int numSearches = 42;
    // This is set up for how many items were locating
    for (int i = 0; i < numSearches; i++) {
      // Variable Decleration
      int random_int = (int) Math.floor(Math.random() * (666 - 0 + 1));
      String item = magicalArray[random_int];
      int counter = 0;
      int lp = 0;
      int rp = magicalArray.length - 1;
      boolean found = false;
      // Actual Search Function
      while (found == false) {
        int mp = lp + (rp - lp) / 2;
        counter++;
        if (magicalArray[mp] == item) {
          found = true;
        } else if ((item.compareToIgnoreCase(magicalArray[mp])) < 0) {
          rp = mp - 1;
        } else {
          lp = mp + 1;
        }
        total = total + counter;
      }
    }
    int average = total / numSearches;
    System.out.println("Binary Search took a total of " + average + " Comparisons");
  }

  public static void MergeSort(String[] magicalArray) throws FileNotFoundException {
    int size = magicalArray.length;
    if (size < 2) {
      return;
    }
    // Get the Size of our Arrays
    int midPoint = size / 2;
    String[] leftHand;
    leftHand = new String[midPoint];
    String[] rightHand;
    rightHand = new String[(size - midPoint)];
    // Fill up the Left Array
    for (int i = 0; i < midPoint; i++) {
      leftHand[i] = magicalArray[i];
    }
    // Fill up the Right Array
    for (int i = midPoint; i < size; i++) {
      rightHand[i - midPoint] = magicalArray[i];
    }
    MergeSort(leftHand);
    MergeSort(rightHand);
    merge(magicalArray, leftHand, rightHand);

  }

  public static void merge(String[] magicalArray, String[] leftHand, String[] rightHand) {
    int leftSize = leftHand.length;
    int rightSize = rightHand.length;
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < leftSize && j < rightSize) {
      if ((leftHand[i].compareToIgnoreCase(rightHand[j]) < 0)) {
        magicalArray[k] = leftHand[i];
        i++;
      } else {
        magicalArray[k] = rightHand[j];
        j++;
      }
      k++;
    }
    while (i < leftSize) {
      magicalArray[k] = leftHand[i];
      i++;
      k++;
    }
    while (j < rightSize) {
      magicalArray[k] = rightHand[j];
      j++;
      k++;
    }
  }
  public static String[] FileReader() throws FileNotFoundException{
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
    MergeSort(magicalArray);
    return magicalArray;
  }
}
