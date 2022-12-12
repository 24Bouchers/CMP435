import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader();
    }

    public static void FileReader() throws FileNotFoundException {
        String textCommand = "";
        LinkedList<Res> Residents = new LinkedList<Res>();
        LinkedList<Hos> Hospitals = new LinkedList<Hos>();
        File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Final\\data.txt");
        Scanner sc1 = new Scanner(file);
        // Array Filler
        while (sc1.hasNextLine()) {
            textCommand = sc1.nextLine();
            int charCounter = 1;
            int charCounter2 = 1;
            float Fid;
            int id = 0;
            String stringCounter = " ";
            if (textCommand.charAt(0) == '-') {
                System.out.println(textCommand);
            }
            if(textCommand.charAt(0) == 'r'){
                while(textCommand.charAt(charCounter) != ':' ){
                    stringCounter = stringCounter + textCommand.charAt(charCounter);
                    charCounter ++;
                }
                Fid = Float.parseFloat(stringCounter);
                id = Math.round(Fid);
                //itest(id);                
            }
        }
    }


    //Prints the string input
    public static void stest(String string){
        System.out.println(string);
    }
    //prints the intput 
    public static void itest(int num){
        System.out.println(num);

    }
}
