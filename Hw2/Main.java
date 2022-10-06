import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    int fileSize = 0;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc = new Scanner(file);

      while(sc.hasNextLine()) {
        sc.nextLine();
        fileSize++;
      }
      System.out.println(fileSize);
    }
  }
