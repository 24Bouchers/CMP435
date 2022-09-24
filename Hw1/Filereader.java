import java.io.File;
import java.util.Scanner;
public class Filereader
{
  public static void main(String[] args) throws Exception
  {
    //snatch the file
    File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw1\\magicitems.txt");
    try (Scanner sc = new Scanner(file)) {
        for(int i = 0; i < 5)
//each line gets converted to uppercase 
          System.out.println((sc.nextLine().toString().toUpperCase()));         
    }
  }
}