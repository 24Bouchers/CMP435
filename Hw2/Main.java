import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    
    
  }

  public static String[] FileReader() throws FileNotFoundException {
  //Var Declerations
    int fileSize = 0;
    String magicalArray[];
    String item = "";
    int c = 0;
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
    Scanner sc0 = new Scanner(file);
    //Find the Ammount of Lines in the file
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
      item = item.toUpperCase();
      magicalArray[c] = item;

      c++;
    }
    sc1.close();
    return magicalArray;
  }

  public static void InsertionSort(Array magicalArray[]) throws FileNotFoundException {
    FileReader();
    System.out.println(magicalArray[1]);
    /*
    int comparisons = 0;
    String temp[];
    temp = new String[1];
    temp[1] = "temp";
    for(int i = 0; i < magicalArray.length; i++){
      int check = 0;
      String compareOne = magicalArray[i].toString();
      String compareTwo = magicalArray[i+1].toString();

      check = compareOne.compareTo(compareTwo);
      if(check > 0){
        temp[1] = magicalArray[];
        magicalArray[i] = magicalArray[i+1]


      }
    }*/
  }
  
}