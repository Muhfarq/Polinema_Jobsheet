import java.util.Scanner;
/**5
 * triangleStar18
 */
public class triangleStar18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();
        int i = 0;
         while (i <=N) {
           int j = 0;
            while (j<i) {
            System.out.print("*");
            j++;
            }
            System.out.println(); //add this so the "*" can be arranged to be triangle
            i++;
        }
    }
}