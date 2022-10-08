import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
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
    int count = 0;
    Shuffle(magicalArray);
    SelectionSort(magicalArray);
    Shuffle(magicalArray);
    InsertionSort(magicalArray);
    Shuffle(magicalArray);
    MergeSort(magicalArray);
    System.out.println("Done Merge");
    Shuffle(magicalArray);
    QuickSort(magicalArray, 1, magicalArray.length - 1);
    System.out.println("Done Quck");
    System.out.println("finished");

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
    System.out.println("Shuffled");
  }

  public static void InsertionSort(String[] magicalArray, int count) throws FileNotFoundException {
    // Set up some basic information
    count = 0;
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
          count++;
          // If there is a value greater, it will swap each number
          if (check < 0) {
            temp[1] = magicalArray[i];
            magicalArray[i] = magicalArray[j];
            magicalArray[j] = temp[1];
          }
        }
      }
    }
    System.out.println("InsertionSort took " + count + " comparisons");
  }

  public static void SelectionSort(String[] magicalArray, int count) throws FileNotFoundException {
    int size = magicalArray.length;
    count = 0;

    for (int i = 0; i < size; ++i) {
      int spot = 1;
      String low = magicalArray[i];
      for (int j = i + 1; j < size; j++) {
        count ++;
        if (magicalArray[j].compareTo(low) < 0) {
          spot = j;
          low = magicalArray[j];
        }
      }
      magicalArray[spot] = magicalArray[i];
      magicalArray[i] = low;
    }
    System.out.println("SelectionSort took " + count + " comparisons");
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
    int counter = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < leftSize && j < rightSize) {
      counter++;
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

  private static void QuickSort(String[] magicalArray, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }

    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
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


