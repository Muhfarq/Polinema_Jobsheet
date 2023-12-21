import java.util.Arrays;

/**
 * Number18
 */
public class Number18 {

    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
// question addition
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("lenght of row " + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}