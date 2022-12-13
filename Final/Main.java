import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader();

    }

    public static void FileReader() throws FileNotFoundException {
        String textCommand = "";
        ResList rList = new ResList();
        HosList hList = new HosList();
        File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Final\\data.txt");
        Scanner sc1 = new Scanner(file);
        // Array Filler
        while (sc1.hasNextLine()) {
            textCommand = sc1.nextLine();
            int charCounter = 1;
            int id = 0;
            String stringCounter = " ";
            if (textCommand.charAt(0) == '-') {
                System.out.println(textCommand);
            }
            if (textCommand.charAt(0) == 'r') {

                while (textCommand.charAt(charCounter) != ':') {
                    stringCounter = stringCounter + textCommand.charAt(charCounter);
                    charCounter++;
                }

                id = Integer.parseInt(stringCounter.trim());
                // itest(id);
                hList.insert(id);

            }

            if (textCommand.charAt(0) == 'h') {
                while (textCommand.charAt(charCounter) != ':') {
                    stringCounter = stringCounter + textCommand.charAt(charCounter);
                    charCounter++;
                }

                id = Integer.parseInt(stringCounter.trim());

                // itest(id);
                hList.insert(id);

            }
            // stest(textCommand);
        }
        Scanner sc2 = new Scanner(file);
        while (sc2.hasNextLine()) {
            textCommand = sc2.nextLine();
            int charCounter = 0;

            int id = 0;
            int cLength = textCommand.length();
            int resCounter = 0;
            String stringCounter = " ";

            if (textCommand.charAt(0) == 'r') {
                resCounter++;
                while (textCommand.charAt(charCounter) != ':') {
                    charCounter++;
                }
                charCounter++;

                while (charCounter < cLength) {
                    while (textCommand.charAt(charCounter) == ' ' || textCommand.charAt(charCounter) == 'h') {
                        charCounter++;
                    }

                    while (charCounter < cLength
                            && (textCommand.charAt(charCounter) != ' ' && textCommand.charAt(charCounter) != 'h')) {
                        stringCounter = stringCounter + textCommand.charAt(charCounter);

                        charCounter++;
                    }

                    id = Integer.parseInt(stringCounter.trim());
                    rList.PrefInsert(resCounter, id);
                }
            }
        }
        rList.Show();
        hList.Show();
        sc1.close();
        sc2.close();
    }

    // Prints the string input

    public static void stest(String string) {
        System.out.println(string);
    }

    // prints the intput
    public static void itest(int num) {
        System.out.println(num);

    }
}
