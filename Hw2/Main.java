import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {



  public static void main(String[] args) throws FileNotFoundException {
    
    
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
    InsertionSort(magicalArray);
  }

  public static void InsertionSort(String[] magicalArray) throws FileNotFoundException {


  
    int comparisons = 0;
    String temp[];
    temp = new String[2];
    temp[1] = null;
    for(int i = 0; i < magicalArray.length; i++){
      int check = 0;
      if((i+1) > magicalArray.length){
        i = magicalArray.length +1;
      }
      String compareOne = magicalArray[i].toString();
      String compareTwo = magicalArray[i+1].toString();


      check = compareOne.compareTo(compareTwo);
      comparisons ++;
      if(check > 0){
        temp[1] = magicalArray[i];
        magicalArray[i] = magicalArray[i+1];
        magicalArray[i+1] = temp[1];
        temp[1] = null;
      }
      System.out.println(magicalArray[i]);
    }
  }
}