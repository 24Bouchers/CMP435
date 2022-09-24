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
  //scorekeeper, if the score is = to its length, then its a palindrome
      if (arrayBack[i] == magicArray[i]) {
        score = score + 1;
      }
    }
    //Output 
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
    //This is kept track of so our print function looks clean
        String commonItem = sc.nextLine();
    // This sets the Array Characters to all be the same case and trims spaces
        magicItem = commonItem.trim().toUpperCase().replaceAll(" ", "");
        int magicLength = magicItem.length();
    //Catch to see if we have a blank line
        if (magicLength == 0) {

        } else {
          Arrayify(commonItem, magicItem, magicLength);
        }
      }
    }
  }
}
