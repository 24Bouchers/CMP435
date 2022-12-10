import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader();
    }

    public static void FileReader() throws FileNotFoundException {
        // PLACE HOLDER VALUES
        String textCommand = "";
        Graph graph = new Graph();

        File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw5\\graphs2.txt");
        Scanner sc1 = new Scanner(file);
        // Array Filler
        while (sc1.hasNextLine()) {
            char firstDigit = ' ';
            char secondDigit = ' ';
            String numString = "";
            int numInt = -1;
            int commandLength = 0;
            // Start Vertex
            int startVertex = 0;
            char Start1 = ' ';
            char Start2 = ' ';
            String startingVertexString = "";
            // To Vertex Valuees
            int toVertex = 0;
            char to1 = ' ';
            char to2 = ' ';
            String toVertexString = "";
            // Weight Values
            int totalWeight = 0;
            char weight1 = ' ';
            char weight2 = ' ';
            String weightString = "";
            textCommand = sc1.nextLine();
            if (textCommand != "") {
                // Check for comments
                if ((textCommand.charAt(0)) == '-') {

                    System.out.println(textCommand);
                    sc1.nextLine();
                }
                // Checks to see if we are making a new graph
                if (textCommand.charAt(0) == 'n') {
                    graph = new Graph();
                    sc1.nextLine();
                }
                if (textCommand.charAt(0) != '-' && textCommand.charAt(0) != 'n') {
                    // Checksto see if we are adding a vertex
                    if (textCommand.charAt(4) == 'v') {
                        commandLength = textCommand.length();
                        if (commandLength == 13) {
                            firstDigit = textCommand.charAt(11);
                            secondDigit = textCommand.charAt(12);
                            numString = String.valueOf(firstDigit) + String.valueOf(secondDigit);
                            numInt = Integer.parseInt(numString);
                            graph.insert(numInt);
                        } else {
                            firstDigit = textCommand.charAt(11);
                            numString = String.valueOf(firstDigit);
                            numInt = Integer.parseInt(numString);
                            graph.insert(numInt);
                        }
                        System.out.println("Added Node: " + numInt);
                    }
                    // Checks To See if we are adding and Edge
                    if (textCommand.charAt(4) == 'e') {
                        commandLength = textCommand.length();
                        int offset = 0;
                        // Setup For the Vertex Selection
                        // Where are we starting from
                        Start1 = textCommand.charAt(9);
                        if (textCommand.charAt(10) != ' ') {
                            Start2 = textCommand.charAt(10);
                            startingVertexString = String.valueOf(Start1) + String.valueOf(Start2);
                            offset++;
                        } else {
                            startingVertexString = String.valueOf(Start1);
                        }
                        startVertex = Integer.parseInt(startingVertexString);
                        // Where we going to
                        to1 = textCommand.charAt(13 + offset);
                        if (textCommand.charAt(14 + offset) != ' ') {
                            to2 = textCommand.charAt(14);
                            toVertexString = String.valueOf(to1) + String.valueOf(to2);
                            offset++;
                        } else {
                            toVertexString = String.valueOf(to1);
                        }
                        toVertex = Integer.parseInt(toVertexString);

                        // What is the Weight of the Path
                        weight1 = textCommand.charAt(commandLength -2);
                        weight2 = textCommand.charAt(commandLength -1);

                        if (weight1 == ' ') {
                            weightString = String.valueOf(weight2);
                        }
                        if (weight2 == ' ') {
                            weightString = String.valueOf(weight1);
                        }
                        if (weight1 != ' ' && weight2 != ' ') {
                            weightString = String.valueOf(weight1) + String.valueOf(weight2);
                        }
                        System.out.print(textCommand + ": ");
                        System.out.println(weightString);
                        totalWeight = Integer.parseInt(weightString);
                        graph.edge(startVertex, toVertex, totalWeight);
                    }
                }
            }
        }

        sc1.close();

    }
}