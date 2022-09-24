import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void Arrayify(String magicItem, int magicLength) {

    char[] magicArray;
    magicArray = new char[magicLength];
    for (int i = 0; i < magicLength; i++) {
      magicArray[i] = magicItem.charAt(i);
    }
  
    pallindromeFinder(magicItem, magicArray, magicLength);
  }

  public static void pallindromeFinder(String magicItem, char[] magicArray, int magicLength) {
    int score = 0;
    char[] arrayBack;
    arrayBack = new char[magicLength];
    for (int i = 0; i < magicLength; i++) {
      arrayBack[i] = magicArray[i];

      if (arrayBack[i] == magicArray[i]) {
        score = score + 1;
        System.out.println(score);
        if (score == magicLength){
          System.out.println(magicItem);
        }
      }
    }
  }
 
  public static void main(String[] args) throws Exception {
    String magicItem = "";
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw1\\magicitems.txt");
    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        // This sets the Array Characters to all be the same case and trims spaces
        magicItem = sc.nextLine().trim().toUpperCase();
        int magicLength = magicItem.length();
        Arrayify(magicItem,magicLength);
      }
    }

  }


}
