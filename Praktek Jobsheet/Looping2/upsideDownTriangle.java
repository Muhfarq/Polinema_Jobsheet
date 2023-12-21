import java.util.Scanner;
/**
 * upsideDownTriangle
 */
public class upsideDownTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        //Input N value
        System.out.print("Enter N : ");
        N = sc.nextInt();
        if (N<5) {
            System.out.println("N minimum is 5");           
        } else {
            printUpsideDownTriangle(N);
        }
    }
    static void printUpsideDownTriangle(int N){
        for (int i = 0; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            // Print '*' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("");
            }

            // Move to the next line after each row
            System.out.println();


        }
    }
}
