import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    int fileSize = 0;
    String unmagicalArray[];
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        fileSize++;
      }
      System.out.println(fileSize);
    //set the unmagicalArray size to the size of the file
      unmagicalArray = new String[fileSize];  // allocating memory to array
      //Fill that array
      while(sc.hasNextLine()) {
        int i = 0;
        String item = sc.nextLine();
        unmagicalArray[i] = item;
        i++;
      }
    }
  }
