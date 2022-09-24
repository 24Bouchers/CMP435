import java.io.File;
import java.util.Scanner;

public class Main {


  public static String main(String[] args) throws Exception {
    String magicItem = "";
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw1\\magicitems.txt");
    Scanner sc = new Scanner(file);
    
    
    while (sc.hasNextLine()) {
      magicItem = sc.nextLine().toUpperCase();
      Arraify(magicItem);
    }
    return magicItem;

  }
  public static  void Arraify(String magicItem) {
    int itemLength = magicItem.length();
    for (int i = 0; i < itemLength; i++) {
      char[] arrayedItem = magicItem.toCharArray();
      System.out.println(arrayedItem);
    }

  }
  /* 
  public void pallindromeFinder(char[] arrayedItem){
    arrayedItem.length;
  }
*/

}