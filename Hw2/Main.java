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
    InsertionSort(magicalArray);
  }

  public static void InsertionSort(String[] magicalArray) throws FileNotFoundException {

    int comparisons = 0;
    String temp[];
    temp = new String[2];
    temp[1] = null;
    for (int a = 0; a < magicalArray.length; a++) {
      for (int i = 0; i < magicalArray.length; i++) {
        String compareOne = magicalArray[i].toString();
        for (int j = 0; j < magicalArray.length; j++) {
          String compareTwo = magicalArray[j].toString();
          int check = compareOne.compareToIgnoreCase(compareTwo);
          comparisons++;
          if (check < 0) {
            temp[1] = magicalArray[i];
            magicalArray[i] = magicalArray[j];
            magicalArray[j] = temp[1];
          }
        }
      }
    }
    for (int i = 0; i < magicalArray.length; i++) {
      System.out.print(magicalArray[i]);
      System.out.print(" ");
      System.out.print("|");
    }
    System.out.print(comparisons);
  }
}