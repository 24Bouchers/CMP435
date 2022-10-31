import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Var Declerations
        int fileSize = 0;
        String magicalArray[];
        String item = "";
        int c = 0;
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\Owner\\Documents\\GitHub\\CMP435\\Hw2\\magicitems.txt");
        Scanner sc0 = new Scanner(file);
        // Find the Ammount of Lines in the file
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
            magicalArray[c] = item;

            c++;
        }
        sc1.close();

        MergeSort(magicalArray);
        // LinearSearch(magicalArray);
        
/*  Compare to test
        for (int i = 0; i < 666; i++) {
            
            int check = magicalArray[i].compareTo(magicalArray[magicalArray.length/2]);
            if (check < 0) {
                System.out.println("Neg");
            }
            if (check > 0) {
                System.out.println("Positive");
            }
            if (check == 0){
                System.out.println("Found it");
            }
        }
*/
    }

    public static void LinearSearch(String[] magicalArray) {

        int total = 0;
        // This is set up for how many items were locating
        for (int i = 0; i < 42; i++) {
            int random_int = (int) Math.floor(Math.random() * (666 - 0 + 1));
            String magicItem = magicalArray[random_int];
            // Counter Counts the ammount of comparisons each item makes
            int counter = 0;
            boolean found = false;
            // Looks for the item
            while (found != true) {
                counter++;
                if (magicItem == magicalArray[counter]) {
                    found = true;
                    total = total + counter;
                }
            }
        }
        System.out.println(total + " Total Comparisons");
    }

    public static void BinarySearch(String[] magicalArray) {
        int total = 0;
        // This is set up for how many items were locating
        for (int i = 0; i < 42; i++) {
            int random_int = (int) Math.floor(Math.random() * (666 - 0 + 1));
            String magicItem = magicalArray[random_int];
            // Counter Counts the ammount of comparisons each item makes
            int counter = 0;
            boolean found = false;
            while (found != true) {
                int lp = 0;
                int hp = magicalArray.length;
                int mp = hp / lp;
                if (magicItem.compareTo(magicalArray[mp]) < 0) {
                    hp = mp;
                    lp = 0;
                    mp = hp / lp;
                } else {
                    if (magicItem.compareTo(magicalArray[mp]) > 0) {
                        lp = mp;
                        hp = magicalArray.length;
                        mp = hp / lp;
                    }
                }
            }
        }

    }

    public static void MergeSort(String[] magicalArray) throws FileNotFoundException {
        int size = magicalArray.length;
        if (size < 2) {
            return;
        }
        // Get the Size of our Arrays
        int midPoint = size / 2;
        String[] leftHand;
        leftHand = new String[midPoint];
        String[] rightHand;
        rightHand = new String[(size - midPoint)];
        // Fill up the Left Array
        for (int i = 0; i < midPoint; i++) {
            leftHand[i] = magicalArray[i];
        }
        // Fill up the Right Array
        for (int i = midPoint; i < size; i++) {
            rightHand[i - midPoint] = magicalArray[i];
        }
        MergeSort(leftHand);
        MergeSort(rightHand);
        merge(magicalArray, leftHand, rightHand);

    }

    public static void merge(String[] magicalArray, String[] leftHand, String[] rightHand) {
        int leftSize = leftHand.length;
        int rightSize = rightHand.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftSize && j < rightSize) {
            if ((leftHand[i].compareToIgnoreCase(rightHand[j]) < 0)) {
                magicalArray[k] = leftHand[i];
                i++;
            } else {
                magicalArray[k] = rightHand[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            magicalArray[k] = leftHand[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            magicalArray[k] = rightHand[j];
            j++;
            k++;
        }
    }
}