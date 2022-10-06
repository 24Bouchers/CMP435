import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    int fileSize = 0;
    int lineChecker = 0;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc = new Scanner(file);
    //While theres a next Line
    while (sc.hasNextLine()) {
    //if the next line has no vlaue
      if (sc.nextLine() == null) {
        //Look to the next 5 lines to see if their empty
        for (int i = 0; i < 5; i++) {
          if (sc.nextLine() == null) {
            lineChecker = lineChecker + 1;
          }
          if (lineChecker == 4) {
          //if the next 5 lines are empty break out from the loop
            break;
          }
        }
      }
      //Increase the length of the array
      fileSize = fileSize + 1;
    }
    System.out.print(fileSize);
      String MagicArray[];
      MagicArray = new String[20];

      /*
       * while (sc.hasNextLine()){
       * String magicItemSTR =sc.nextLine();
       * }
       */
    }
  }
