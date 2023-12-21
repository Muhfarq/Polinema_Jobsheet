import java.util.Scanner;
/**
 * numericTriangle
 */
public class numericTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        // To input N value
        System.out.print("enter the value of N (Min 3) : ");
        N = sc.nextInt();
        if (N < 3) {
            System.out.println("minimum value N is 3.");

        } else {
            //Print triangle
            printNumericTriangle(N);
        }
    }
    static void printNumericTriangle(int N){
        for (int i = 1; i <= N ; i++) {
            for (int j = -1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}