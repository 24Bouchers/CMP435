import java.io.File;

import java.util.Scanner;

public class Main {
  // Turns what will become a magic item into an array
  public static void Arrayify(String commonItem, String magicItem, int magicLength) {

    char[] magicArray;
    // sets the array length to be the length
    magicArray = new char[magicLength];
    for (int i = 0; i < magicLength; i++) {
      magicArray[i] = magicItem.charAt(i);
    }

    pallindromeFinder(commonItem, magicItem, magicArray, magicLength);
  }

  public static void pallindromeFinder(String commonItem, String magicItem, char[] magicArray, int magicLength) {
    int score = 0;
    char[] arrayBack;
    arrayBack = new char[magicLength];
    for (int i = 0; i < magicLength; i++) {
      arrayBack[i] = magicArray[(magicLength - 1 - i)];

      if (arrayBack[i] == magicArray[i]) {
        score = score + 1;
      }

    }
    if (score == magicLength) {
      System.out.println(commonItem + ": is a palindrome");
    }
  }

  public static void main(String[] args) throws Exception {
    String magicItem = "";
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw1\\magicitems.txt");
    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        // This sets the Array Characters to all be the same case and trims spaces
        String commonItem = sc.nextLine();
        magicItem = commonItem.trim().toUpperCase().replaceAll(" ", "");

        int magicLength = magicItem.length();
        if (magicLength == 0) {

        } else {
          Arrayify(commonItem, magicItem, magicLength);
        }
      }
    }
  }
}
