import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    String[] magicalArray = FileReader();
    InventoryCheck(magicalArray);
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
    MergeSort(magicalArray);
    return magicalArray;
  }

  public static void InventoryCheck(String[] magicalArray){
    for(int i =0; i <magicalArray.length; i++){
      System.out.println(magicalArray[i]);
    }
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

}
