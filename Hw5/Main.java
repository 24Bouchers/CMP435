import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader();
    }

    public static void FileReader() throws FileNotFoundException {
        String textCommand = "";
        Graph graph = new Graph();
        File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw5\\graphs2.txt");
        Scanner sc1 = new Scanner(file);
        // Array Filler
        while (sc1.hasNextLine()) {
            textCommand = sc1.nextLine();
            if (textCommand != "") {
                if ((textCommand.charAt(0)) == '-') {

                    System.out.println(textCommand);
                }
                if (textCommand.charAt(0) == 'n') {

                    graph = new Graph();
                }
                if (textCommand.charAt(4) == 'v') {

                    graph.insert(Character.getNumericValue(textCommand.charAt(11)));
                }
                if (textCommand.charAt(4) == 'e') {

                }
                if (textCommand == "") {
                    graph.show();
                }
            }
            sc1.close();
        }
    }
}