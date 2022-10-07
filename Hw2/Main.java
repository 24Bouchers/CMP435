import java.io.File;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class Main {
  public static void main(String[] args) throws Exception {
    int fileSize = 0;
    String unmagicalArray[];
    String item = "test";
    int c = 0;
    int co = 1;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc0 = new Scanner(file);

      while(sc0.hasNextLine()) {
        sc0.nextLine();
        fileSize++;
      }
      sc0.close();
    //set the unmagicalArray size to the size of the file
      unmagicalArray = new String[fileSize];  // allocating memory to array
      //Fill that array
    Scanner sc1 = new Scanner(file);
      while(sc1.hasNextLine()) {

        item = sc1.nextLine();
        
        unmagicalArray[c] = item;
        System.out.println(unmagicalArray[c]);
        c++;
      }
      sc1.close();
    }
  }
