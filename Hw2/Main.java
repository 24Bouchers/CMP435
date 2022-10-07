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
  }

  public static void SelectionSort(String[] magicalArray) throws FileNotFoundException {
    //Set up some basic information
    int comparisons = 0;
    String temp[];
    temp = new String[2];
    temp[1] = null;
    //This is the r
    for (int a = 0; a < magicalArray.length; a++) {
      //this will find select the frist element in the arayy
      for (int i = 0; i < magicalArray.length; i++) {
        String compareOne = magicalArray[i].toString();
        //and compare it to each item in the list
        for (int j = 0; j < magicalArray.length; j++) {
          String compareTwo = magicalArray[j].toString();
          int check = compareOne.compareToIgnoreCase(compareTwo);
          comparisons++;
          //If there is a value greater, it will swap each number
          if (check < 0) {
            temp[1] = magicalArray[i];
            magicalArray[i] = magicalArray[j];
            magicalArray[j] = temp[1];
          }
        }
      }
    }
    //This is just my test to visually see if it sorts
    /* 
    for (int i = 0; i < magicalArray.length; i++) {
      System.out.print(magicalArray[i]);
      System.out.print(" ");
      System.out.print("|");
    }
    System.out.print(comparisons);
    */
  }

  public static void InsertionSort(String[] magicalArray) throws FileNotFoundException {
    int comparisons = 0;
  }
}