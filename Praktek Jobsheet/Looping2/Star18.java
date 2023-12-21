import java.util.Scanner;
/**
 * Star18
 */
public class Star18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of N: ");
        int N = sc.nextInt();
        for (int i = 1; i >= N; i++) {
            System.out.print("*");            
        }
    }
}